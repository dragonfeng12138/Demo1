package test.demo;

import com.dragon.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dragon
 * @create 2021-06-20 15:40
 */
public class testBean {
    @Test
    public void testAdd(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.add();
    }

}
