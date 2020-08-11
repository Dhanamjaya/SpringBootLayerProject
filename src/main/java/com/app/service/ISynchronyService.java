package com.app.service;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.app.model.Synchrony;

@Service
public interface ISynchronyService extends CrudRepository<Synchrony, Integer> {

	@Query(" FROM Synchrony s WHERE s.syfId=:syfId")
	Synchrony getMyData(Integer syfId);
	
	@Query("SELECT s.syfLoc FROM Synchrony s WHERE s.syfId=:syfId")
	String getDetails(Integer syfId);
	
	@Query("SELECT s.syfId,s.syfLoc FROM Synchrony s WHERE s.syfId=:syfId")
	Object getMultiDetails(Integer syfId);
	
	}
