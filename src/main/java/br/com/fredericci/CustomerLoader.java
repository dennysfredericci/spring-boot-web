package br.com.fredericci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

import br.com.fredericci.model.Customer;

@Component
public class CustomerLoader {

	@Autowired
	private br.com.fredericci.repository.CustomerRepository repository;

	public void run() {
		
		Faker faker = new Faker();
		
		for (int i = 0; i < 50; i++) {
			save(new Customer(faker.name().firstName(), faker.name().lastName()));	
		}
		
	}

	private void save(Customer customer) {
		System.out.println(customer.toString());
		repository.save(customer);
	}
	
}
