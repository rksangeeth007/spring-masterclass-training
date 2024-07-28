package in28minutes.database.springdatajpa;

import in28minutes.database.entity_jpa.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {
}
