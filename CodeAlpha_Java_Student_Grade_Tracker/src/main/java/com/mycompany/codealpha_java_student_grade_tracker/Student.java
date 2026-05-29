/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codealpha_java_student_grade_tracker;

/**
 *
 * @author ASD
 */
public class Student {
     private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
    
    public String getStatus(){
        if(grade>=85)
            return "Excellent";
        else if(grade>=70)
            return "Good";
        else if(grade>=50)
            return "Pass";
        else
            return "Fail";
    }
    
 }
