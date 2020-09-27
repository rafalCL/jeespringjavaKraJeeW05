package pl.coderslab.zaddom4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MemoryCustomerRepository implements CustomerRepository {
    private CustomerLogger logger;

    @Autowired
    public MemoryCustomerRepository(@Qualifier("fileCustomerLogger") CustomerLogger logger) {
        this.logger = logger;
    }

    @Override
    public void addCustomer(Customer c) {
        this.logger.log();
    }
}
