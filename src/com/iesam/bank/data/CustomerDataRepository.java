package com.iesam.bank.data;

import com.iesam.bank.domain.Class.Customer;
import com.iesam.bank.domain.Class.CustomerRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CustomerDataRepository implements CustomerRepository {

     public final Map<String, Customer> customerMap = new HashMap<>();


    public final ArrayList<Customer> customers = new ArrayList<>();



    public static CustomerRepository instance=null;

    public static CustomerDataRepository newInstance() {
      if(instance==null){
          instance = new CustomerDataRepository();

      }
      return (CustomerDataRepository) instance;

    }


    @Override
    public void save(Customer customer) {

    }

    @Override
    public void delete(String dni) {

    }

    @Override
    public void obtain(String dni) {

    }


}
