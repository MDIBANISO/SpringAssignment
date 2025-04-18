package com.springAssignment1.controller;

import com.springAssignment1.model.Course;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.*;

    @RestController
    @RequestMapping("/api/courses")
    public class CourseCrudController {

        private final Map<Long, Course> courseDB = new HashMap<>();
        private Long idCounter = 1L;

        @PostMapping
        public Course createCourse(@Valid @RequestBody Course course) {
            course.setId(idCounter++);
            courseDB.put(course.getId(), course);
            return course;
        }

        @GetMapping
        public Collection<Course> getAllCourses() {
            return courseDB.values();
        }

        @GetMapping("/{id}")
        public Course getCourse(@PathVariable Long id) {
            return courseDB.get(id);
        }

        @PutMapping("/{id}")
        public Course updateCourse(@PathVariable Long id, @Valid @RequestBody Course course) {
            course.setId(id);
            courseDB.put(id, course);
            return course;
        }

        @DeleteMapping("/{id}")
        public String deleteCourse(@PathVariable Long id) {
            courseDB.remove(id);
            return "Deleted course with id: " + id;
        }
    }


