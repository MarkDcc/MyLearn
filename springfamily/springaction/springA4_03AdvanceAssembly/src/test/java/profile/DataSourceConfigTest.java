package profile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author
 * @Description TODO
 * @date
 */
public class DataSourceConfigTest {

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes = DataSourceConfig.class)
    @ActiveProfiles("dev")
    public static class DevDataSourceConfigTest {
        @Autowired
        private DataSource dataSource;
        @Test
        public void shouldBeEmbeddedDatasource() {
            assertNotNull(dataSource);
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            List<String> results = jdbcTemplate.query("SELECT t.id,t.name From Things t", new RowMapper<String>() {
                @Override
                public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                    return rs.getLong("id") + ":" + rs.getString("name");
                }
            });
            assertEquals(1, results.size());
            assertEquals("1:A", results.get(0));
        }

    }

}
