package net.shabana.springboot_backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id")
    private String emailId;

    public void setEmailId(String mail) {
    }

    public void setlastName(String selvi) {
    }

    public void setFirstName(String siva) {
    }

    public String getFirstname() {
        return firstName;
    }

    public String getlastname() {
        return lastName;
    }

    public String getEmailId() {
        return emailId;    }
}
