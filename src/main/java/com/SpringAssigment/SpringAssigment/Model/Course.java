package com.SpringAssigment.SpringAssigment.Model;

public class Course {
    package com.springAssignment1.model;

import jakarta.validation.constraints.NotBlank;

    public class Course {

        private Long id;

        @NotBlank(message = "Course name is required")
        private String name;

        @NotBlank(message = "Course level is required")
        private String level;

        // Getters and Setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getLevel() { return level; }
        public void setLevel(String level) { this.level = level; }
    }

}
