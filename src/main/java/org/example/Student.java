package org.example;

public class Student {
    String name;
    int kiekis = 0;
    int[] grades = new int[kiekis];

    public Student(String name) {
        this.name = name;
    }

    public void addGrade(int grade) {
        kiekis++;
        int[] temp = new int[kiekis];
        for (int i = 0; i < grades.length; i++) {
            temp[i] = grades[i];
        }
        temp[kiekis - 1] = grade;
        grades = temp;
    }


}
