package org.example;

public class TaskHeirTeacherTester {
    public static void main(String[] args) {
//can use parent class independently
        TaskHeircTeacher tht= new TaskHeircTeacher();
        tht.teach();
        tht.prepareLesson();

//can use subClasses independently
        MathTeacher mt=new MathTeacher();
        mt.schoolName="Monor";
        mt.math();

    }

}
