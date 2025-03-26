package com.example.cicdtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CiCdTestApplication {

    public static void main(String[] args) {
        //이렇게 해보자
        int sum = 0;
        for (int i = 0 ; i < 1000 ; i++){
            sum+=i;
        }

        for (int i = 0 ; i < 1000 ; i++){
            sum+=i;
        }

        for (int i = 0 ; i < 1000 ; i++){
            sum+=i;
        }

        for (int i = 0 ; i < 1000 ; i++){
            sum+=i;
        }

    }

}
