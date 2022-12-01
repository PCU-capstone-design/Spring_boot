package com.example.demo.controller;

import com.example.demo.dto.Firstdto;
import com.example.demo.entity.Infomation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

//    private InfomationRepository infomationRepository;


    @GetMapping("/api/hello")
    public String test() {
        return "Hello, wosss";
    }
    @PostMapping("/api/hihi")
    public String test2(@RequestBody Firstdto from){
        System.out.println(from.toString());

        //dto
//        Infomation infomation = from.toEntity();
        //repository
//        Infomation saved = infomationRepository.save(infomation);


        return "";
    }
}