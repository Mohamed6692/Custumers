package ma.school.tpcustomerapplication.jsf;

import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import java.io.Serializable;
import java.util.List;
import ma.school.tpcustomerapplication.entity.Customer;
import service.CustomerManager;


@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {
private List<Customer> customerList;  
@Inject  
private CustomerManager customerManager;
  public CustomerBean() {
  }
  /** 
   * Retourne la liste des clients pour affichage dans une DataTable.
   */  
  public List<Customer> getCustomers() {
    if (customerList == null) {
      customerList = customerManager.getAllCustomers();
    }
    return customerList;
  }  
}