package com.embarkx.FirstSpring;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public HelloResponse hello(){

        /*return "Hello World!";*/
        return new HelloResponse("Hello World!");
    }

    @GetMapping("/hello/{name}")
    public HelloResponse helloParam(@PathVariable String name){
        return new HelloResponse("Hello, " + name);
    }

    @PostMapping("/hello")
    public HelloResponse helloPost(@RequestBody String name){

        /*return "Hello" +name+ "!";*/
        return  new HelloResponse("Hello" + name + "!");
    }
}
