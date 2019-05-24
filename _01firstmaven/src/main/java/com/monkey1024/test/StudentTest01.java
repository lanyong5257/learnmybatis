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


/**
 * FileName: StudentTest01
 * Description:
 *
 * @author lanyong
 * @create 2019/5/22
 */
public class StudentTest01 {
    @Test
    public void InsertStudent(){
        StudentDao studentDao=new StudentDaoImpl();
        Student student=new Student("刘德华",23,43.5);
        studentDao.insertStudent(student);
        }
    }
