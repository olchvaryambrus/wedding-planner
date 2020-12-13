package com.szoftlab.weddingplanner.service;


import com.szoftlab.weddingplanner.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    RegistrationRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //Csinál egy új usert az adatbázisban lévő adatokból
        return new User(repository.findByUserName(username).getUserName(),repository.findByUserName(username).getPassword(), new ArrayList<>());
    }
}
