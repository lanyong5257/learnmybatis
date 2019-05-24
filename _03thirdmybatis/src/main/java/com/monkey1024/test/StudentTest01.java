/*
 * Copyright (c) 2018,TravelSky.
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 */
package com.monkey1024.test;

import com.monkey1024.bean.Student;
import com.monkey1024.dao.StudentDao;
import com.monkey1024.dao.impl.StudentDaoImpl;
import org.junit.Test;

import java.util.List;

/**
 * FileName: StudentTest01
 * Description:
 *
 * @author lanyong
 * @create 2019/5/23
 */
public class StudentTest01 {
    StudentDao studentDao=new StudentDaoImpl();
    @Test
    public void insertStudent(){

        Student student = new Student("兰勇",23,45.5);
        studentDao.insertStudent(student);
    }
    @Test
    public void deleteStudent(){
        studentDao.deleteStudent(2);
    }
    @Test
    public void updateStudent(){
        Student student=new Student("李白",23,23.5);
        student.setId(3);
        studentDao.updateStudent(student);
    }
    @Test
    public void selectStudentById(){
        Student student = studentDao.selectStudentById(3);
        System.out.println(student);
        System.out.println("i love git so much");
    }
    @Test
    public void selectAll(){
        List<Student> students=studentDao.selectAllStudents();
        for(Student s:students){
            System.out.println(s);
        }
    }
}