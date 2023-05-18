package com.school.student.result.management.model;

import javax.persistence.*;

@Entity
@Table(name = "RESULT")
public class Result {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column(name="course_id", nullable=false)
    private int courseId;

    @Column(name="student_id", nullable=false)
    private int studentId;

    @Column(name = "score")
    private String score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", studentId=" + studentId +
                ", score='" + score + '\'' +
                '}';
    }
}
