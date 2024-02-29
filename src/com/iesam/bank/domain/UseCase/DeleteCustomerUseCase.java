package com.iesam.bank.domain.UseCase;

import com.iesam.bank.domain.Class.CustomerRepository;

public class DeleteCustomerUseCase {

    private CustomerRepository customerRepository;

    public DeleteCustomerUseCase(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;

    }

    public void execute(String dni){

    }

}
