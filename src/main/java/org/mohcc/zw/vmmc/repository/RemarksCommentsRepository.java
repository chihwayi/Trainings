package org.mohcc.zw.vmmc.repository;
import org.mohcc.zw.vmmc.model.RemarksComments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemarksCommentsRepository extends JpaRepository<RemarksComments,String> {

}
