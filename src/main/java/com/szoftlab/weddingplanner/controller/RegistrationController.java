package com.szoftlab.weddingplanner.controller;

import com.szoftlab.weddingplanner.model.WeddingUser;
import com.szoftlab.weddingplanner.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class RegistrationController {

    private RegistrationService service;

    @Autowired
    public RegistrationController(RegistrationService registrationService){
        this.service = registrationService;
    }

    @PostMapping("/registration")
    public WeddingUser registerUser(@RequestBody WeddingUser user) throws Exception {
        String tempEmailId = user.getEmailId();
        if (tempEmailId != null && !"".equals(tempEmailId)){
            WeddingUser userobj = service.fetchUserByEmailId(tempEmailId);
            if (userobj != null){
                throw new Exception("Ezzel az email címmel " + tempEmailId + " már regisztráltak!");
            }
        }
        WeddingUser userObj = null;
        userObj = service.saveUser(user);
        return userObj;
    }

    @PostMapping("/login")
    public WeddingUser loginUser(@RequestBody WeddingUser user) throws Exception{
        String tempEmailId = user.getEmailId();
        String tempPassword = user.getPassword();
        WeddingUser userObj = null;
        if (tempEmailId != null && tempPassword != null){
            userObj = service.fetchUserByEmailIdAndPassword(tempEmailId, tempPassword);
        }
        if (userObj == null) {
            throw new Exception("Nem adta meg az email címét vagy a jelszavát");
        }
        return userObj;
    }
}
