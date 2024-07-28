package in28minutes.database.jpa;

import in28minutes.database.entity_jpa.Person;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
//import javax.transaction.Transactional;
import jakarta.persistence.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;


//We're adding transaction as u r dealing with operations on a DB and if there're 3 4 operations happening in a single transaction, you either need all to succeed or all to fail.
@Repository
@Transactional
public class PersonJpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Person findById(int id) {
        return entityManager.find(Person.class, id);

    }

    public Person update(Person person) {
        return entityManager.merge(person);
    }

    public Person insert(Person person) {
        return entityManager.merge(person);
    }

    //Here, you can also pass a Person directly into the deleteById method or pass an id, get the person details and then delete that.
    public void deleteById(int id) {
        Person p = findById(id);
        entityManager.remove(p);
    }

    public List<Person> findAll() {
        TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
        return namedQuery.getResultList();
    }

}
