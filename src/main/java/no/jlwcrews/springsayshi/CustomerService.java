package no.jlwcrews.springsayshi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    DataService dataService;

    @Autowired
    public CustomerService(DataService dataService) {
        this.dataService = dataService;
    }

    public CustomerData fetchCustomerData(int id) {
        CustomerDataNameInterfaceSoftDrink cdnisd = CustomerDataNameInterfaceSoftDrink.builder()
                .ageOfElvis(28)
                .nameOfFavoriteChicken("Rupert")
                .build();
        return new CustomerData(id, "Big John Box Turtle", 9);
    }
}
