package com.tts.subscriberlist.subscriber;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

//persistence includes .Column, .Entity, .GeneratedValue, .GenerationType, .Id
import javax.persistence.*;
import java.util.Date;

/*
@Entity - We use this annotation to designate a plain old Java object (POJO) class as an
entity so that we can use it with JPA services.
 */
@Entity
public class Subscriber {

    /*
    @Id - JPA will recognize it as the object’s ID and primary key
    @GeneratedValue - Allows the underlying database to set the value for the field.
    @Column -   attribute is stored in a database table column whose name matches that of
    the persistent field or property
    @CreationTimestamp - sets the value of the date field to the current time and date
    exactly once during creation.
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    @Column
    @CreationTimestamp
    private Date signedUp;

    //constructors
    public Subscriber() {
       //no-argument constructor for our class, which is necessary for the JPA
    }
    public Subscriber(String firstName, String lastName, String userName, Date signedUp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.signedUp = signedUp;
    }

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getSignedUp() {
        return signedUp;
    }

    public void setSignedUp(Date signedUp) {
        this.signedUp = signedUp;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", signedUp=" + signedUp +
                '}';
    }
}//end Subscriber class
