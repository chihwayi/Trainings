package org.mohcc.zw.vmmc.repository;

import java.util.List;

import org.mohcc.zw.vmmc.model.TitleDesignation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TitleDesignationRepository extends JpaRepository<TitleDesignation,Integer>{
	
	@Query("Select new TitleDesignation(a.title_id, b.designation_id, a.title, b.designation) "
			+ "FROM Title a "
			+ "JOIN "
			+ "Designation b "
			+ "ON a.title_id = b.title_id")
	List<TitleDesignation> getTitleDesignationData();

}
