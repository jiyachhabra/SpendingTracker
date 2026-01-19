package org.example;

import Controller.StudentManger;
import Entity.Student;

public class Main {
    public static void main(String[] args) {

        Student[] s1 = new Student[3];

        s1[0]= new Student("Jiya",22);
        s1[1]= new Student("Aadvik",15);
        s1[2]= new Student("Kabir",5);

        StudentManger sm = new StudentManger();

        for(int i =0;i< s1.length;i++){
            sm.printStudent(s1[i]);
            System.out.println("-----");
        }
    }
}