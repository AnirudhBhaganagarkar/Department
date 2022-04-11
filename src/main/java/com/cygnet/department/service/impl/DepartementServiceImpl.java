package com.cygnet.department.service.impl;

import com.cygnet.department.model.Departement;
import com.cygnet.department.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartementServiceImpl {
    @Autowired
    private DepartementRepository departementRepository;



    public Departement saveDepartement(Departement departement) {
        return departementRepository.save(departement);
    }

    public Departement findDepartementById(Long id) {
        return departementRepository.findById(id).get();
    }
}
