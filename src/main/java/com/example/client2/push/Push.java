package com.example.client2.push;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Push {
    @GetMapping("/push")
    public String sendPush() {
        System.out.println("push was sent");
        return "push was sent";
    }
}
