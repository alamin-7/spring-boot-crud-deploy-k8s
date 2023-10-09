package springbootcrudk8s.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_test_kube")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private Date dob;

    public User(){

    }
    public User(String name, String email, Date dob, long id) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
