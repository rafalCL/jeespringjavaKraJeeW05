package pl.coderslab.zaddom4;

import org.springframework.stereotype.Component;

@Component
public class SimpleCustomerLogger implements CustomerLogger {
    @Override
    public void log() {
        System.out.println("Customer operation");
    }
}
