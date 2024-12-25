package com.DMSys.until;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Mybatis 工具类
 **/
public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory = null;
    private MybatisUtil(){}
    /**
     * 静态代码块
     * static 修改{} 叫做静态代码块；jvm 加载优先级最高；且只初始化一次；一般用来加载数据库驱动或者一些特定的配置文件；常驻jvm 内存中；
     */
    static {
        String resource = "resource/mybatis-config.xml";
        // 读取配置文件mybatis-config.xml
        InputStream config = null;
        try {
            config = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // jvm 通过流的方式吧mybaits-config.xml 读取到内存中创建mybatis 执行sql 对象；
        // 该对象的创建采用工厂模式 来执行sql;
        // 单例模式：饿汉式 懒汉式
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
    }

    /**
     * 创建执行sql的对象；
     */
    public static SqlSession openSession(){

        return  sqlSessionFactory.openSession();

    }
    /**
     * 关闭或者打开执行sql对象；
     */
    public static SqlSession openSession(Boolean flag){
        return  sqlSessionFactory.openSession(flag);
    }
    /**
     * 关闭会话对象
     */
    public static void closeSqlSession(SqlSession sqlSession){
        if (sqlSession!=null){
            sqlSession.close();
        }
    }
    // sql回归
    public static void dateRoolBack(SqlSession sqlSession){
        if (sqlSession!=null){
            sqlSession.rollback();
        }
    }

    /**
     * 提交事务
     */
    public static void dateCommit(SqlSession sqlSession){
        if (sqlSession!=null){
            sqlSession.commit();
        }
    }



}
