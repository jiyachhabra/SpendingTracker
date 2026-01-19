package org.example;

import Controller.StudentManger;
import Entity.Student;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Jiya",11);

        StudentManger manager =  new StudentManger();
        manager.printStudent(s1);
    }
}