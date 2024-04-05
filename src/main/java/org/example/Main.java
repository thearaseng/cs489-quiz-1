package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.example.model.Contact;
import org.example.repository.ContactRepository;

import java.text.SimpleDateFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        printAllContacts();

    }

    private static void printAllContacts() throws JsonProcessingException {
        ObjectWriter ow = new ObjectMapper()
                .setDateFormat(new SimpleDateFormat("yyyy-MM-dd"))
                .writer().withDefaultPrettyPrinter();

        Contact[] contacts = ContactRepository.getAllContacts();
        String json = ow.writeValueAsString(contacts);
        System.out.println(json);
    }
}