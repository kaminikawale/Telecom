package com.velocity.repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.NetworkFunction;
@Repository
public interface NetworkFunctionRepository extends CrudRepository<NetworkFunction, Serializable>{
	public NetworkFunction getNetworkFunctionById(Integer id);
	
}
