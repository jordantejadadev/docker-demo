package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:5173")
public class MessageController {

    private final MessageRepository repository;

    @GetMapping("/message")
    public Message getMessage() {
        return repository.findAll().get(0);
    }
}
