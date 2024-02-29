package com.iesam.bank.domain.Class;

public interface CustomerRepository {
void add(Customer customer);
void save(Customer customer);
void delete(String dni);

void obtain(String dni);

}
