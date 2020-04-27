package com.example.springjdbc;

import com.example.springjdbc.entity.Spitter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;


import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootApplication
@Slf4j
public class SpringJdbcApplication implements CommandLineRunner {

	@Qualifier("dataSource")
	@Autowired
	private DataSource dataSource;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
    private SpitterRepositoryImp spitterRepositoryImp;

	Spitter spitter = new Spitter("CC","admin","dongcc","ccc@com",true);

	public static void main(String[] args) {

		SpringApplication.run(SpringJdbcApplication.class, args);
//		SpringJdbcApplication springJdbcApplication = SpringJdbcApplication.class;

	}

	public void showCon() throws SQLException {
		dataSource.getConnection().toString();
		log.info(dataSource.getConnection().toString());
	}

	private void saveSpitter(){
	    spitterRepositoryImp.save(this.spitter);
    }
    private void find(){
	    log.info(spitterRepositoryImp.findSpitter(1L).getUsername());
    }
	private void createData(){
	    jdbcTemplate.execute("CREATE TABLE FOO (ID INT IDENTITY, BAR VARCHAR(64));");
	    jdbcTemplate.update("INSERT INTO FOO (ID, BAR) VALUES (1, 'aaa')");
    }
	private void showDate(){
	    jdbcTemplate.queryForList("SELECT * FROM spitter").forEach(element -> log.info(element.toString()));
    }

	@Override
	public void run(String... args) throws Exception {
		showCon();
		//createData();
        saveSpitter();
		showDate();
		find();
	}
}
