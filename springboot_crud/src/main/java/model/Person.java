package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persons")
public class Person {

    private long id;
    private String firstName;
    private String lastName;
    private String favColorId;

    public Person() {

    }

    public Person(String firstName, String lastName, String favColorId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favColorId = favColorId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "favColor_address", nullable = false)
    public String getEmailId() {
        return favColorId;
    }
    public void setEmailId(String favColorId) {
        this.favColorId = favColorId;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", favColorId=" + favColorId
                + "]";
    }

}