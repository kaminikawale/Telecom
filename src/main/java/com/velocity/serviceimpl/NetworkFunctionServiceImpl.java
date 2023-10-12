package com.velocity.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.NetworkFunction;
import com.velocity.repository.NetworkFunctionRepository;
import com.velocity.service.NetworkFunctionService;
@Service
public class NetworkFunctionServiceImpl implements NetworkFunctionService{
	@Autowired
    private NetworkFunctionRepository networkfunctionrepository;
	@Override
	public NetworkFunction getNetworkFunctionById(Integer id) {
		NetworkFunction netfuns=networkfunctionrepository.getNetworkFunctionById(id);
		return netfuns;
	}
}
