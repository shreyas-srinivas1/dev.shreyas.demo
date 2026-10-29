package dev.shreyas.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
//@Entity tells Spring & Hibernate that this must made into a table
public class EngineerProfile {
    @Id //Tells DB that the variable 'id' is a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Tells spring to let the DB to handle assigning the ID
    private Long id;

    private String name;
    private String targetRole;

    //Constructors
    public EngineerProfile(){} //Default constructor is mandatory for hibernate to function

    public EngineerProfile(String name, String targetRole)
    {
        this.name=name;
        this.targetRole=targetRole;
    }

    //Getters
    public Long getId(){return id;}
    public String getName(){return name;}
    public String getTargetRole(){return targetRole;}
}
