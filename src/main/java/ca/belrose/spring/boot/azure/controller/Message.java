package ca.belrose.spring.boot.azure.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Message {

    @GetMapping("/message")
    public ResponseEntity<String> displayMessage(){
        var message = "Congratulation! Your Spring boot app successfully deploy on azure";
        return ResponseEntity.ok(message);
    }
}
