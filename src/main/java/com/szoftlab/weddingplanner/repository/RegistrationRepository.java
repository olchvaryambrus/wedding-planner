package com.szoftlab.weddingplanner.repository;

import com.szoftlab.weddingplanner.model.WeddingUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends CrudRepository<WeddingUser, Long> {

    WeddingUser findByEmailId(String emailId);

    WeddingUser findByEmailIdAndPassword(String emailId, String password);

    WeddingUser findByUserName(String userName);
}
