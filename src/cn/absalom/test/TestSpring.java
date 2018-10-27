package cn.absalom.test;

import cn.absalom.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//表示这是一个Spring的测试类
@RunWith(SpringJUnit4ClassRunner.class)
//定位Spring的配置文件
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpring {
    @Autowired
    //装配Category
    Category c;
    @Test
    public void test(){
        System.out.println(c.getName());
    }
}

