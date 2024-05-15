package org.example;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("studentas");
        Student student1 = new Student("studentas1");
        Student student2 = new Student("studentas2");
        Student student3 = new Student("studentas3");
        Student student4 = new Student("studentas4");
        Student student5 = new Student("studentas5");
        Student student6 = new Student("studentas6");
        Student student7 = new Student("studentas7");
        Student student8 = new Student("studentas8");
        Student student9 = new Student("studentas9");
        Student student10 = new Student("studentas10");
        Student student11 = new Student("studentas11");

        student.addGrade(10);
        student.addGrade(9);
        student.addGrade(8);

        student1.addGrade(10);
        student1.addGrade(10);
        student1.addGrade(7);

        student2.addGrade(10);
        student2.addGrade(10);
        student2.addGrade(10);

        student3.addGrade(10);
        student3.addGrade(10);
        student3.addGrade(9);

        student4.addGrade(10);
        student4.addGrade(10);
        student4.addGrade(8);

        student5.addGrade(10);
        student5.addGrade(10);
        student5.addGrade(7);

        student6.addGrade(10);
        student6.addGrade(9);
        student6.addGrade(9);

        student7.addGrade(10);
        student7.addGrade(9);
        student7.addGrade(10);

        student8.addGrade(10);
        student8.addGrade(10);
        student8.addGrade(8);

        student9.addGrade(9);
        student9.addGrade(9);
        student9.addGrade(9);

        student10.addGrade(9);
        student10.addGrade(9);
        student10.addGrade(8);

        School school = new School();
        school.addStudent(student);
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.addStudent(student5);
        school.addStudent(student6);
        school.addStudent(student7);
        school.addStudent(student8);
        school.addStudent(student9);
        school.addStudent(student10);
        school.addStudent(student11);

        school.calculateAverage("studentas1");
        school.printStudentGrades("studentas1");
        school.printTOP10Students();
        System.out.println();
        school.studentuSarasas();

    }
}