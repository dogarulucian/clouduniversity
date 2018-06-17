package com.clouduniversity.controllers;

import com.clouduniversity.models.FileUpload;
import com.clouduniversity.models.Student;
import com.clouduniversity.repositories.FileUploadRepository;
import com.clouduniversity.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
public class StoreController {

//    @GetMapping("/")
//    public String index() {
//        return "index";
//    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");
            }
        };
    }

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    FileUploadRepository fileUploadRepository;

    @PostMapping("/uploadMyFile")
    public void handleFileUpload(@RequestParam("file")  MultipartFile file) {
        System.out.println("Heree");
        //studentRepository.save(file);

    }

    @GetMapping("/getall")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    @CrossOrigin("http://localhost:4200")
    //@PostMapping(name = "/upload", headers = "content-type=multipart/*",consumes = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(name = "/upload",consumes = MediaType.APPLICATION_JSON_VALUE)
    public void handleUpload(@RequestBody(required = false)  MultipartFile file) {

        System.out.println("cxxxcxz");

    }


}
