package com.chen.sm.service;

import com.chen.sm.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {
    private StudentService studentService;
    @BeforeEach
    void setUp() {
        studentService = new StudentService();
    }

    @Test
    void testAddStudentSuccess() {
        Student student = new Student("1", "John", 20, 90.0);
        assertTrue(studentService.add(student), "Student should be added successfully.");
    }

    @Test
    void testAddStudentDuplicateIdFailure() {
        studentService.add(new Student("1", "John", 20, 90.0));
        assertFalse(studentService.add(new Student("1", "Jane", 21, 95.0)), "Duplicate ID should not be added.");
    }

    @Test
    void testRemoveStudentExists() {
        studentService.add(new Student("1", "John", 20, 90.0));
        assertTrue(studentService.remove("1"), "Student should be removed.");
    }

    @Test
    void testRemoveStudentNotExists() {
        assertFalse(studentService.remove("1"), "Student does not exist, should not be removed.");
    }

    @Test
    void testUpdateStudent() {
        studentService.add(new Student("1", "John", 20, 90.0));
        assertTrue(studentService.update("1", "Jane", 21, 95.0), "Student should be updated.");
        Student updatedStudent = studentService.getById("1");
        assertEquals("Jane", updatedStudent.getName(), "The name should be updated.");
        assertEquals(21, updatedStudent.getAge(), "The age should be updated.");
        assertEquals(95.0, updatedStudent.getScore(), "The score should be updated.");
    }

    @Test
    void testGetAllStudents() {
        studentService.add(new Student("1", "John", 20, 90.0));
        studentService.add(new Student("2", "Jane", 22, 85.0));
        assertEquals(2, studentService.listAll().size(), "There should be two students.");
    }
}
