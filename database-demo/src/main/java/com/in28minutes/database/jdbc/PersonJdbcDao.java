package in28minutes.database.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import in28minutes.database.entity.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    class PersonRowMapper implements RowMapper<Person>{

        @Override
        public Person mapRow(ResultSet resultSet, int i) throws SQLException {
            Person person = new Person();
            person.setId(resultSet.getInt("id"));
            person.setName(resultSet.getString("name"));
            person.setLocation(resultSet.getString("location"));
            person.setBirthDate(resultSet.getTimestamp("birth_date"));
            return null;
        }
    }

    //Commenting for implementing using Custom RowMapper
//    public List<Person> findAll() {
//        return jdbcTemplate.query("select * from Person",
//                new BeanPropertyRowMapper<Person>(Person.class));
//    }

    public List<Person> findAll() {
        return jdbcTemplate.query("select * from person",
                new PersonRowMapper() {
                });
    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject("select * from person where id=?"
                , new Object[]{id}, new BeanPropertyRowMapper<Person>(Person.class));
    }

    //This returns a number back(NO: of rows deleted)
    //Note: We don't need BeanPropertyRowMapper for deletion
    public int deleteById(int id) {
        return jdbcTemplate.update("delete from person where id=?"
                , new Object[]{id});
    }

    public int insert(Person person) {
        return jdbcTemplate.update("Insert into person(id,name,location,birth_date) "
                        + " Values( ? , ? , ? , ?)"
                , new Object[]{person.getId(), person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime())});
    }

    public int update(Person person) {
        return jdbcTemplate.update("Update person "
                        + " set name = ? , location = ? , birth_date = ? " +
                " where id = ? "
                , new Object[]{person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()), person.getId()});
    }
}
