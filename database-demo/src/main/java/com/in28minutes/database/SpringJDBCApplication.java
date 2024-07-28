package in28minutes.database;

import in28minutes.database.entity.Person;
import in28minutes.database.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


//Comment your springboot application annotation if you have multiple runner classes in the same classpath.
@SpringBootApplication
public class SpringJDBCApplication implements CommandLineRunner {

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJDBCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("All users -> {}" , dao.findAll());
		LOGGER.info("User 10001 -> {}" , dao.findById(10001));
		LOGGER.info("10003 deleted -> No: of rows deleted -> {}" , dao.deleteById(10003));
		LOGGER.info("Inserting 10004 -> No: of rows added -> {}" , dao.insert(new Person(10004, "sangu", "Blore", new Date())));
		LOGGER.info("Updating 10004 -> No: of rows updated -> {}" , dao.update(new Person(10003, "sangii", "kerala", new Date())));
	}
}
