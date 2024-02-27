package com.example.SPRINGDATA.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("library/v1")
public class BookController {

    @PostMapping("/books")
    public void createBook(@RequestBody createBookRequest){

    }


}
