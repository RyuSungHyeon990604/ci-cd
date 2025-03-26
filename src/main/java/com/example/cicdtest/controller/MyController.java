package com.example.cicdtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public int home(){

        int a = 1;
        int b = 0;
        int c = a / b; // 0으로 나누기 위험
        int d = a / b; // 0으로 나누기 위험
        int e = a / b; // 0으로 나누기 위험
        int f = a / b; // 0으로 나누기 위험
        int h = a / b; // 0으로 나누기 위험
        int k = a / b; // 0으로 나누기 위험
        int kl = a / b; // 0으로 나누기 위험
        int kl2 = a / b; // 0으로 나누기 위험
        int kl3 = a / b; // 0으로 나누기 위험
        int kl4 = a / b; // 0으로 나누기 위험

        return kl4;
    }
}
