/*
 * Copyright (c) 2018,TravelSky.
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 */
package com.monkey1024.util;

import com.sun.org.apache.regexp.internal.RE;
import jdk.nashorn.internal.ir.ReturnNode;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


/**
 * FileName: MyBatisUtil
 * Description:
 *
 * @author lanyong
 * @create 2019/5/23
 */
public class MyBatisUtil {
    private static volatile SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession() {
        if (sqlSessionFactory == null) {
            InputStream input = null;
            try {
                input = Resources.getResourceAsStream("mybatis.xml");
                synchronized (MyBatisUtil.class) {
                    if (sqlSessionFactory == null) {
                        sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sqlSessionFactory.openSession();
    }
}