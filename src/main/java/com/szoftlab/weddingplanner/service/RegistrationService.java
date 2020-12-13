package com.szoftlab.weddingplanner.service;

import com.szoftlab.weddingplanner.model.WeddingUser;
import com.szoftlab.weddingplanner.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private RegistrationRepository repository;

    @Autowired
    public RegistrationService(RegistrationRepository registrationRepository){
        this.repository = registrationRepository;
    }

    public WeddingUser saveUser(WeddingUser user){
        return repository.save(user);
    }

    public WeddingUser fetchUserByEmailId(String emailId){
        return repository.findByEmailId(emailId);
    }

    public WeddingUser fetchUserByEmailIdAndPassword(String emailId, String password){
        return repository.findByEmailIdAndPassword(emailId, password);
    }
}
