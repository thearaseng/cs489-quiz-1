package org.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Email {

    private long id;
    private String label;
    private String emailAddress;

    @JsonIgnore
    private Contact contact;

}
