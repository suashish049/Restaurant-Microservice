package com.swiggato.restaurant.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {

//	@Autowired
//	private RestaurantProfile restaurantProfile;
	
	public void viewProfile(@PathVariable Long id){
		
		//return restaurantProfile;
	}
	
}
