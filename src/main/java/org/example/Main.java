package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.example.model.Contact;
import org.example.repository.ContactRepository;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        printAllContacts();

    }

    private static void printAllContacts() throws JsonProcessingException {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();

        Contact[] contacts = ContactRepository.getAllContacts();

        Arrays.sort(contacts,
                Comparator.comparing(Contact::getLastName)
        );

        String json = ow.writeValueAsString(contacts);
        System.out.println(json);
    }
}