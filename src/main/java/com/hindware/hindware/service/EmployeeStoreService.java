package com.hindware.hindware.service;


import com.hindware.hindware.Utils.Helper;
import com.hindware.hindware.dao.AsmRepository;
import com.hindware.hindware.dao.SalePersonRepository;
import com.hindware.hindware.dao.SihRepository;
import com.hindware.hindware.dao.ZonalManagerRepository;
import com.hindware.hindware.entity.AsmEntity;
import com.hindware.hindware.entity.SalePersonEntity;
import com.hindware.hindware.entity.ZonalManagerEntity;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class EmployeeStoreService {

    @Autowired
    ZonalManagerRepository zonalManagerRepository;

    @Autowired
    AsmRepository asmRepository;

    @Autowired
    SalePersonRepository salePersonRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    private Helper helper;


    public String saveZonalManager(ZonalManagerEntity zonalManagerEntity) {
        try {

            zonalManagerEntity.setZonalManagerId(helper.generateRandomUuid());
            zonalManagerEntity.setPassword(passwordEncoder.encode(zonalManagerEntity.getPassword()));

            zonalManagerRepository.save(zonalManagerEntity);

        } catch (Exception e) {
            throw new RuntimeException("Something went wrong please try agian",e);
        }
        return "User stored successfully";
    }

    public String saveAsmManager(AsmEntity asmEntity) {
        try {
            asmEntity.setAsmId(helper.generateRandomUuid());
            asmEntity.setPassword(passwordEncoder.encode(asmEntity.getPassword()));

            asmRepository.save(asmEntity);

        } catch (Exception e) {
            throw new RuntimeException("Something went wrong please try agian",e);
        }
        return "User stored successfully";
    }

    public String saveSalePerson(SalePersonEntity salePersonEntity) {
        try {
            salePersonEntity.setSale_person_id(helper.generateRandomUuid());
            salePersonEntity.setPassword(passwordEncoder.encode(salePersonEntity.getPassword()));

            salePersonRepository.save(salePersonEntity);

        } catch (Exception e) {
            throw new RuntimeException("Something went wrong please try agian",e);
        }
        return "User stored successfully";
    }
}
