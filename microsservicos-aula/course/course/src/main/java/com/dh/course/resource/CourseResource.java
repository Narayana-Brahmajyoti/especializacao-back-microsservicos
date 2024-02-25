package com.dh.course.resource;

import com.dh.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseResource {

    @Autowired
    private CourseService service;

    @GetMapping("/subscription/port")
    public ResponseEntity<String> getSubscriptionPort(@RequestHeader("course-request-header") String header){
        System.out.println(header);
        return ResponseEntity.ok(service.getSubscriptionPort());
    }
}
