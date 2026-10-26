package com.example.consumer.model;

public class Course {

    private String courseId;
    private String title;
    private String trainer;
    private double price;

    public Course(){}

    public String getCourseId(){
        return courseId;
    }

    public void setCourseId(String courseId){
       this.courseId = courseId;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
       this.title = title;
    }

    public String getTrainer(){
        return trainer;
    }

    public void setTrainer(String trainer){
       this.trainer = trainer;
    }
}
