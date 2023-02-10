package com.ead.authuser.services.implement;

import com.ead.authuser.repositories.UserCourseRepository;
import com.ead.authuser.services.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCourseServiceImplement implements UserCourseService {

    @Autowired
    UserCourseRepository userCourseRepository;


}