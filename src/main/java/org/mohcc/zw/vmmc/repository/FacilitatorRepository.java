package org.mohcc.zw.vmmc.repository;

import org.mohcc.zw.vmmc.model.Facilitator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacilitatorRepository extends JpaRepository<Facilitator,String>{

}
