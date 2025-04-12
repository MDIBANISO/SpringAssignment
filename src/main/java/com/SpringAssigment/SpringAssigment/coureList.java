package com.example.courseinfo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class coureList {

    @GetMapping("/courses")
    public String getCourses() {
        return """
            <h2>📚 Foundation Courses</h2>
            <ul>
                <li>Introduction to Computing</li>
                <li>Basic Programming Concepts</li>
            </ul>

            <h2>🎓 Undergraduate Courses</h2>
            <ul>
                <li>Data Structures and Algorithms</li>
                <li>Object-Oriented Programming</li>
                <li>Database Systems</li>
                <li>Operating Systems</li>
                <li>Computer Networks</li>
            </ul>

            <h2>🎓 Honours Courses</h2>
            <ul>
                <li>Machine Learning</li>
                <li>Advanced Algorithms</li>
                <li>Distributed Systems</li>
                <li>Cybersecurity Principles</li>
            </ul>
        """;
    }
}

