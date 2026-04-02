package com.example.demo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class Partice {


    @GetMapping("/hi")
    public String beDemo(){
        return " hello Guys My Name Is Jay Kadam";
    }

//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/JayKadam007/SpringBoot-CICD.git
//    git push -u origin main
}
