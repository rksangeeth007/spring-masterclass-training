package in28minutes.database;

import in28minutes.database.entity_jpa.Person;
import in28minutes.database.jdbc.PersonJdbcDao;
import in28minutes.database.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


//@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJpaRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("User 10001 -> {}", repository.findById(10001));
        LOGGER.info("Inserting 10004 -> {}", repository.insert(new Person(10004, "sangu", "Blore", new Date())));
        LOGGER.info("Updating 10003 -> {}", repository.update(new Person(10002, "sangii", "kerala", new Date())));
        repository.deleteById(10002);
        LOGGER.info("Showing all records from Person DB", repository.findAll());
    }
}