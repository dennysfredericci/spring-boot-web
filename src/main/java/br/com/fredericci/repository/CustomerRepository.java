package br.com.fredericci.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fredericci.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>  {
	
	List<Customer> findByLastName(String lastName);
	

}
