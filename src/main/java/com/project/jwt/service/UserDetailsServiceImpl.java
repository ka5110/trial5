//package com.project.jwt.service;
//
//import com.project.jwt.bean.ApplicationUser;
//import com.project.jwt.repository.ApplicationUserRepository;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Collections;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    private ApplicationUserRepository applicationUserRepository;
//
//    public UserDetailsServiceImpl(ApplicationUserRepository applicationUserRepository) {
//        this.applicationUserRepository = applicationUserRepository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        ApplicationUser applicationUser = applicationUserRepository.findByUsername(username);
//        if (applicationUser == null) {
//            throw new UsernameNotFoundException(username);
//        }
//        return new User(applicationUser.getEmail(), applicationUser.getPassword(), Collections.emptyList());
//    }
//}
