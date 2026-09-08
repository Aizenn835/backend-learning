package com.codewithlei.rest_api;


public class StudentRequest {
    private String name;
    private String course;

    public StudentRequest(String course, String name) {
        this.course = course;
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String format(StudentRequest request){
        return "Student Name: " + request.getName() + "\n" +
               "Student course: " + request.getCourse();
    }
}
