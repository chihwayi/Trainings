package org.mohcc.zw.vmmc.repository;

import org.mohcc.zw.vmmc.model.Funding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FundingRepository extends JpaRepository<Funding,String>{

}
