package com.cygnet.department.repository;

import com.cygnet.department.model.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Long>
{
    Departement findDepartementById(Long id);
}
