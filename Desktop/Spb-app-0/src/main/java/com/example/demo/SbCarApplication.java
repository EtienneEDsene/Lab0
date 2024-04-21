package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SbCarApplication {
    private static final Logger logger = LoggerFactory.getLogger(SbCarApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SbCarApplication.class, args);
        logger.info("Car App started ! Goto http://localhost:8081/M1glsi_Etienne_Sene");

	}

}

@RestController
@RequestMapping("/M1glsi_Etienne_Sene")
class SbCarController {
    @Value("${fullname:Etienne}")
    private String fullname;
    
    @GetMapping()
    public String getfullname() {
        return " travail effectué par  "  + this.fullname +  " !";
    }


}
