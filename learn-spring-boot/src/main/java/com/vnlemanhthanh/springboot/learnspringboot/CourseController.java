/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping({"/courses", "/courses.html"})
    public List<Course> retrieveAllCourse() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "vnlemanhthanh"),
                new Course(2, "Learn DevOps", "vnlemanhthanh")
        );
    }
}
