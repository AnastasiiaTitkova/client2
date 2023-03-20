package com.example.client2.push;

import org.springframework.web.bind.annotation.*;

@RestController
public class Push {
    @RequestMapping(value="/push", method= RequestMethod.POST)
    public String sendPush() {
        System.out.println("push was sent");
        return "push was sent";
    }
}
