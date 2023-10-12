package com.velocity.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.velocity.model.NetworkFunction;
import com.velocity.service.NetworkFunctionService;
@RestController
public class NetworkFunctionRestcontroller {
	@Autowired
	   private NetworkFunctionService networkfunctionservice;
		@GetMapping("/getNetworkFunctionById/{id}")
		public NetworkFunction getNetworkFunctionById(@PathVariable("id")Integer id) {
			NetworkFunction netfunr=networkfunctionservice.getNetworkFunctionById(id);
			return netfunr;
			
		}
}
