package com.cygnet.department.controller;

import com.cygnet.department.model.Departement;
import com.cygnet.department.service.impl.DepartementServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departement")
@Slf4j
public class DepartementController
{
    @Autowired
    private DepartementServiceImpl departementService;

    @PostMapping("/")
    public Departement saveDepartement(@RequestBody Departement departement)
    {
        log.info("Inside Department method of departement");
        return departementService.saveDepartement(departement);
    }

    @GetMapping("/{id}")
    public Departement findDepartementById(@PathVariable("id") Long id)
    {
        log.info("Inside Department method of departement");
        return departementService.findDepartementById(id);
    }

}
