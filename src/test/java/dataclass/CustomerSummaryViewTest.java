package dataclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerSummaryViewTest {
    CustomerSummaryView customerSummaryView;

    @BeforeEach
    void setUp() {
        Address customersAddress = new Address();
        customersAddress.setCity("United city");
        customersAddress.setCountry("United Country");
        customersAddress.setPostcode("0000");
        Customer customer = new Customer();
        customer.setTitle("Ms.");
        customer.setFirstName("Jane");
        customer.setLastName("Doe");
        customer.setAddress(customersAddress);
        customerSummaryView = new CustomerSummaryView(customer);
    }

    @Test
    void shouldReturnCustomersInformationCorrectly() {
        String result = "Ms. Jane Doe, United city, 0000, United Country";
        assertEquals(result, customerSummaryView.getCustomerSummary());
    }
}