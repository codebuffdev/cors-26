package in.codebuffdev.boot.bootcors.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestControllers {

    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
    
    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    @PostMapping("/name")
    public String update(@RequestBody Map<String,String> body){
        return "updated name " + body.get("name");
    }
}
