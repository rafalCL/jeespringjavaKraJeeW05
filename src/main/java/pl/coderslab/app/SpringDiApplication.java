package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.HelloWorld;

public class SpringDiApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld hw = context.getBean("helloWorld", HelloWorld.class);
        hw.hello();

        context.close();
    }
}
