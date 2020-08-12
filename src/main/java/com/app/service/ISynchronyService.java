package com.app.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.app.model.Synchrony;

@Service
public interface ISynchronyService extends CrudRepository<Synchrony, Integer> {

	
	}
