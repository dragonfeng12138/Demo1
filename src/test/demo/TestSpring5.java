package test.demo;

import com.dragon.spring5.Book;
import com.dragon.spring5.Orders;
import com.dragon.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dragon
 * @create 2021-06-20 12:41
 */
public class TestSpring5 {
    @Test
    public void testAdd(){
        //1、加载spring配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        //2、获取配置创建对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
    @Test
    public void testBook(){
        //1、加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2、获取配置创建对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.test();
    }
    @Test
    public void testOeders(){
        //1、加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2、获取配置创建对象
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.test();
    }

}
