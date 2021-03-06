package com.monkey1024.dao;

import com.monkey1024.bean.Student;

import java.util.List;

public interface StudentDao {
    void insertStudent(Student student);
    void deleteStudent(int id);
    void updateStudent(Student student);
    Student selectStudentById(int id);
    List<Student> selectAllStudents();
}
