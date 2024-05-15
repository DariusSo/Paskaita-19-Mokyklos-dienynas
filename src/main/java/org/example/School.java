package org.example;

public class School {
    int studentuKiekis = 0;
    Student[] students = new Student[0];

    public void addStudent(Student student){
        studentuKiekis++;
        Student[] temp = new Student[studentuKiekis];
        for (int i = 0; i < students.length; i++) {
            temp[i] = students[i];
        }
        temp[studentuKiekis - 1] = student;
        students = temp;
    }

    public void studentuSarasas(){
        boolean swapped;
        int n = students.length;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (students[i - 1].name.compareTo(students[i].name) > 0) {
                    Student temp = students[i - 1];
                    students[i - 1] = students[i];
                    students[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name);
        }
    }

    public double calculateAverage(String name){
        int suma = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equals(name)){
                for (int j = 0; j < students[i].grades.length; j++) {
                    suma = suma + students[i].grades[j];
                }
                double average = (double) suma / students[i].grades.length;
                return average;
            }
        }
        return 0;
    }
    public void printStudentGrades(String name){
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equals(name)) {
                System.out.println(name + " pazymiai yra:");
                for (int j = 0; j < students[i].grades.length; j++) {
                    System.out.println(students[i].grades[j]);
                }
            }
        }
    }
    public void printTOP10Students(){
        boolean swapped;
        int n = students.length;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (calculateAverage(students[i - 1].name) < calculateAverage(students[i].name)) {
                    Student temp = students[i - 1];
                    students[i - 1] = students[i];
                    students[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
        for(int i = 0; i < 10; i++){
            System.out.printf(students[i].name + "  %.2f", calculateAverage(students[i].name));
            System.out.println();
        }

    }


}
