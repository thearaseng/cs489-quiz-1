package org.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Phone {

    private long id;
    private String label;
    private String phoneNumber;

    @JsonIgnore
    private Contact contact;

}
