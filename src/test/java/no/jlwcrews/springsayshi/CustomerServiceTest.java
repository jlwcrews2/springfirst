package no.jlwcrews.springsayshi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CustomerServiceTest {

    @Autowired
    CustomerService customerService;

    @Test
    void shouldReturnCustomerData(){
        var result = customerService.fetchCustomerData(10);
        assert result.age() == 9;
    }
}
