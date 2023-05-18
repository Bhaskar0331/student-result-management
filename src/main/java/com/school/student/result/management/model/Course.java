package com.school.student.result.management.model;

import javax.persistence.*;

@Entity
@Table(name = "COURSE")
public class Course {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
