package dataclass;

public class CustomerSummaryView {
        private final Customer customer;
    
        public CustomerSummaryView(Customer customer){
            this.customer = customer;
        }
    
        public String getCustomerSummary(){
            Address address = customer.getAddress();
            return customer.getTitle() + " " + customer.getFirstName() + " " + customer.getLastName() + ", " + 
                    address.getCity() + ", " + address.getPostcode() + ", " + address.getCountry();
        }
    }