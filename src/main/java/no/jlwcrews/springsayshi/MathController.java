package no.jlwcrews.springsayshi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/math")
public class MathController {

    CustomerService customerService;

    @Autowired
    public MathController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/{name}")
    public String getHello(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/customerId/{id}")
    public ResponseEntity<CustomerData> getCustomerData(@PathVariable int id) {
        return new ResponseEntity<>(customerService.fetchCustomerData(id), HttpStatus.OK);
    }

    @PostMapping()
    public String postHello(@RequestBody CustomerData data) {
        return "Hello " + data.name() + ", you are " + data.age() + ".";
    }

}

