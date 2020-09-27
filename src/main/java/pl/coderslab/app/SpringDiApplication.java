package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.zaddom4.Customer;
import pl.coderslab.zaddom4.CustomerRepository;

public class SpringDiApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld hw = context.getBean("helloWorld", HelloWorld.class);
        hw.hello();

        CustomerRepository cr = context.getBean("memoryCustomerRepository", CustomerRepository.class);
        cr.addCustomer(new Customer(1, "ala"));

        context.close();
    }
}
