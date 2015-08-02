package br.com.fredericci.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fredericci.model.Customer;
import br.com.fredericci.repository.CustomerRepository;

@RestController
@RequestMapping(value="/customers")
public class CustomerController {

	@Autowired
	private CustomerRepository repository;
	
	
	@RequestMapping(method=RequestMethod.GET)
    public List<Customer> listAllCustomers() {
		return repository.findAll();
    }
	
}
