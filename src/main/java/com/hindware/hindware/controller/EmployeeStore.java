package com.hindware.hindware.controller;


import com.hindware.hindware.entity.AsmEntity;
import com.hindware.hindware.entity.SalePersonEntity;
import com.hindware.hindware.entity.ZonalManagerEntity;
import com.hindware.hindware.service.EmployeeStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hindware/saveEmployee")
public class EmployeeStore {

    @Autowired
    private EmployeeStoreService getUserEntityService;

    @PostMapping("/saveZonalManager")
    public String saveZonalManager(@RequestBody ZonalManagerEntity zonalManagerEntity) {
        try {
            getUserEntityService.saveZonalManager(zonalManagerEntity);
            return "User stored successfully";
        } catch (Exception e) {
             throw new RuntimeException("Something went wrong please try agian",e);
        }
    }

    @PostMapping("/saveAsm")
    public String saveASM(@RequestBody AsmEntity asmEntity) {
        try {
            getUserEntityService.saveAsmManager(asmEntity);
            return "User stored successfully";
        } catch (Exception e) {
            throw new RuntimeException("Something went wrong please try agian",e);
        }
    }

    @PostMapping("/saveSalePerson")
    public String saveSalePerson(@RequestBody SalePersonEntity salePersonEntity) {
        try {
            getUserEntityService.saveSalePerson(salePersonEntity);
            return "User stored successfully";
        } catch (Exception e) {
            throw new RuntimeException("Something went wrong please try agian",e);
        }
    }
}

