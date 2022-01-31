package com.ajayspace.ciao.ciao.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1")
class MainController {


    @GetMapping
    fun getMessage():String{
       return "Hello world !! ciao..."
    }

}