package main;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Student;

import java.io.IOException;
import java.io.InputStream;

public class MyTest {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();

        Student student = new Student("jerry", 5, 88);
        session.insert("insert",student);

        session.commit();
    }
}
