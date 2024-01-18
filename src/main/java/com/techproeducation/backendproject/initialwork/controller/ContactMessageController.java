package com.techproeducation.backendproject.initialwork.controller;


import com.techproeducation.backendproject.initialwork.entity.ContactMessage;
import com.techproeducation.backendproject.initialwork.service.ContactMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contactMessage") // http://localhost:8080/contactMessage
public class ContactMessageController {


    @Autowired
    private ContactMessageService contactMessageService;

    //@PostMapping("/save") //http://localhost:8080/contactMessage/save
    //public ResponseEntity<ContactMessage>

}
