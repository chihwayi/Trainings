package org.mohcc.zw.vmmc.repository;

import org.mohcc.zw.vmmc.model.Title;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitleRepository  extends JpaRepository<Title,Integer>{

}
