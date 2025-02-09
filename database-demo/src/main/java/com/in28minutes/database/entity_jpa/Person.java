package in28minutes.database.entity_jpa;


//import javax.persistence.*;
import jakarta.persistence.*;
import java.util.Date;

//You're adding namedQuery only for dealing with findAll method, We're using JPQL here or HQL(Java persistence QL or Hibernate QL)
@NamedQuery(name="find_all_persons", query = "select p from Person p")
@Entity
public class Person {

    //Autogenerate usually use some stratgey to create new ID using some sequence.

//    @GeneratedValue
    @Id
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="location")
    private String location;

    @Column(name="birth_date")
    private Date birthDate;

    public Person(){
    }

    public Person(int id, String name, String location, Date birthDate) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    //Adding this constructor as I want hibernate to autogenerate the id as mentioned above using annotation.
    public Person(String name, String location, Date birthDate) {
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "\n Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
