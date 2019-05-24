/*
 * Copyright (c) 2018,TravelSky.
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 */
package com.monkey1024.dao.impl;

import com.monkey1024.bean.Student;
import com.monkey1024.dao.StudentDao;
import com.monkey1024.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: StudentDaoImpl
 * Description:
 *
 * @author lanyong
 * @create 2019/5/23
 */
public class StudentDaoImpl implements StudentDao {

    @Override
    public void insertStudent(Student student) {
        try(SqlSession sqlSession= MyBatisUtil.getSqlSession()){
        sqlSession.insert("insertStudent",student);
        sqlSession.commit();}
    }
    public void deleteStudent(int id){
        try(SqlSession sqlSession=MyBatisUtil.getSqlSession()){
            sqlSession.delete("deleteStudent",id);
            sqlSession.commit();
        }
    }

    @Override
    public void updateStudent(Student student) {
        try(SqlSession sqlSession=MyBatisUtil.getSqlSession()){
            sqlSession.update("updateStudent",student);
            sqlSession.commit();
        }
    }

    @Override
    public Student selectStudentById(int id) {
        Student student=null;
        try(SqlSession sqlSession=MyBatisUtil.getSqlSession()){
            student = sqlSession.selectOne("selectStudentById", id);
        }
        return student;
    }

    @Override
    public List<Student> selectAllStudents() {
        List<Student> students=null;
        try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
           students = sqlSession.selectList("selectAllStudents");
        }
        return students;
    }
}