package com.example;

import java.util.List;

public class SeatingChart {
    private Student[][] seats;
    private List<Student> studentList;
    private int rows;
    private int cols;

    // Constructor to implement a)
    public SeatingChart(List<Student> studentList, int rows, int cols) {
        this.studentList=studentList;
        this.rows=rows;
        this.cols=cols;
        
        seats= new Student[rows][cols];
        int indexCount=0;
        for (Student student: studentList) {
           seats[indexCount%rows][indexCount/(cols-1)]= student;
           indexCount++; 
        }
    }

    // Method to implement b)
    public int removeAbsentStudents(int allowedAbsences) {
        int removedStudents=0;
        for (int i=0; i<seats.length; i++) {
            for (int j=0; j<seats[i].length; j++) {
                if (seats[i][j] != null && seats[i][j].getAbsenceCount()>allowedAbsences) {
                    seats[i][j]=null;
                    removedStudents++;
                }
            }
        }
        return removedStudents;
    }

    public Student[][] getSeats() {
        return seats;
    }
}
