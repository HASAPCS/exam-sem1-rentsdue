package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class SeatingChartTest {

    private List<Student> studentList;
    private SeatingChart seatingChart;

    @BeforeEach
    public void setup() {
        // Setup a list of students
        studentList = new ArrayList<>();
        studentList.add(new Student("Karen", 3));
        studentList.add(new Student("Liz", 1));
        studentList.add(new Student("Paul", 4));
        studentList.add(new Student("Lester", 1));
        studentList.add(new Student("Henry", 5));
        studentList.add(new Student("Renee", 9));
        studentList.add(new Student("Glen", 2));
        studentList.add(new Student("Fran", 6));
        studentList.add(new Student("David", 1));
        studentList.add(new Student("Danny", 3));

        // Initialize SeatingChart
        seatingChart = new SeatingChart(studentList, 3, 4);
    }

    @Test
    public void testSeatingChartConstructor() {
        assertNotNull(seatingChart, "SeatingChart should be initialized");
        assertEquals(studentList.get(0), seatingChart.getSeats()[0][0], "Should be Karen");
        assertEquals(studentList.get(1), seatingChart.getSeats()[1][0], "Should be Liz");
        assertEquals(studentList.get(2), seatingChart.getSeats()[2][0], "Should be Paul");
        assertEquals(studentList.get(3), seatingChart.getSeats()[0][1], "Should be Lester");
        assertEquals(studentList.get(4), seatingChart.getSeats()[1][1], "Should be Henry");
        assertEquals(studentList.get(5), seatingChart.getSeats()[2][1], "Should be Renee");
        assertEquals(studentList.get(6), seatingChart.getSeats()[0][2], "Should be Glen");
        assertEquals(studentList.get(7), seatingChart.getSeats()[1][2], "Should be Fran");
        assertEquals(studentList.get(8), seatingChart.getSeats()[2][2], "Should be David");
        assertEquals(studentList.get(9), seatingChart.getSeats()[0][3], "Should be Renee");
        

        // Check if the last seat is null (since there are only 10 students but 12 seats)
        assertNull(seatingChart.getSeats()[1][3], "The last seat should be null");
        assertNull(seatingChart.getSeats()[2][3], "The last seat should be null");
    }

    @Test
    public void testRemoveAbsentStudents() {
        int removedStudents = seatingChart.removeAbsentStudents(4);
        assertEquals(3, removedStudents, "Should remove 3 students");
        // Checking if students with more than 4 absences are removed
        assertNull(seatingChart.getSeats()[1][2], "Student with more than 4 absences should be removed");
        assertNull(seatingChart.getSeats()[1][3], "Student with more than 4 absences should be removed");
        assertNull(seatingChart.getSeats()[2][1], "Student with more than 4 absences should be removed");
    }
   
}
