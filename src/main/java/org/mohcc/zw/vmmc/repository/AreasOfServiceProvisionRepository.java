package org.mohcc.zw.vmmc.repository;

import org.mohcc.zw.vmmc.model.AreasOfServiceProvision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreasOfServiceProvisionRepository extends JpaRepository<AreasOfServiceProvision, String> {
}
