package ie.atu.HelloWorldpt2;

import org.springframework.web.bind.annotation.*;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/hello")
    public String hello(){

        return "Hello!";

    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){
        return "Hello it's " + name;
    }

    @GetMapping("/details")
    public String details(@RequestParam String name,@RequestParam int age){
        // http://localhost:8080/details?name=Bob&age=20
        String request = "My name is " + name + " and I am " + age;
        return request;
    }

}
