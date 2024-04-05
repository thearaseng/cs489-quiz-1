package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class Contact {

    private long id;
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<Phone> phones;
    private List<Email> emails;

    public Contact(long id, String firstName, String lastName, String company, String jobTitle) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
    }

}
