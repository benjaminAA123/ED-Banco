package com.iesam.bank.domain.UseCase;

import com.iesam.bank.domain.Class.Customer;
import com.iesam.bank.domain.Class.CustomerRepository;

public class CreateCustomUseCase {

public final CustomerRepository customerRepository;


public CreateCustomUseCase(CustomerRepository customerRepository){

    this.customerRepository = customerRepository;
}

public final void execute(Customer customer){

    customerRepository.save(customer);
}

}
