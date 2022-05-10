package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                 applicationContext.getBean("helloworld",HelloWorld.class);
        System.out.println(bean.getMessage());

        Cat one = applicationContext.getBean("cat",Cat.class);
        System.out.println(one.getMessage());



        Cat two = applicationContext.getBean("cat",Cat.class);
        two.setMessage("It's second Cat");
        System.out.println(two.getMessage());
        System.out.println(one.equals(two));

        System.out.println(one == two);





    }
}
