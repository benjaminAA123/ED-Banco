package com.iesam.bank.domain.UseCase;

import com.iesam.bank.domain.Class.Customer;
import com.iesam.bank.domain.Class.CustomerRepository;

import java.util.ArrayList;

public class GetCustomerUseCase {

    private CustomerRepository customerRepository;

    public GetCustomerUseCase(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;


    }

    //public ArrayList<CustomerRepository>execute(String dni){

    //}

}
