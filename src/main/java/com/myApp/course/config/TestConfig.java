	package com.myApp.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.myApp.course.entities.Order;
import com.myApp.course.entities.User;
import com.myApp.course.entities.enums.OrderStatus;
import com.myApp.course.repositories.OrderRepository;
import com.myApp.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	@Autowired // dependecy injection
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository; 
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User(1, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(2, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		Order o1 = new Order(null, Instant.parse("2022-12-25T19:53:07Z"),OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2022-12-30T03:42:10Z"),OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2023-02-19T15:21:22Z"),OrderStatus.WAITING_PAYMENT, u1);
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
	
}
