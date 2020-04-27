package com.example.springjdbc;

import com.example.springjdbc.entity.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class SpitterRepositoryImp implements SpitterRepository {
    final String INSERT_SQL = "insert into Spitter (username, password, fullname, email, updateByEmail) values ( ?, ?, ?, ?, ?)";
    final String QUERY_SQL =  "select id, username, password, fullname, email, updateByEmail from Spitter";
    @Autowired
    JdbcTemplate jdbcTemplate;

    private class SpitterRowMapper implements RowMapper<Spitter>{

        @Override
        public Spitter mapRow(ResultSet rs, int rowNum) throws SQLException {

            return new Spitter(
                                rs.getString("username"),
                                rs.getString("password"),
                                rs.getString("fullName"),
                                rs.getString("email"),
                                rs.getBoolean("updateByEmail")
                    );
        }

    }

    @Override
    public void save(Spitter spitter) {
        jdbcTemplate.update(INSERT_SQL,spitter.getUsername(),
                            spitter.getPassword(),
                            spitter.getFullName(),
                            spitter.getEmail(),
                            spitter.isUpdateByEmail()
                            );
    }

    @Override
    public Spitter findSpitter(Long id) {
       return jdbcTemplate.queryForObject(QUERY_SQL + " where id=?", new SpitterRowMapper(),id);

    }


}
