package com.example.securityEazyByte.config;

import java.util.List;

import com.example.securityEazyByte.model.Customer;
import com.example.securityEazyByte.model.SecurityCustomer;
import com.example.securityEazyByte.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class EazyBankUserDetails implements UserDetailsService {

    @Autowired
    private CustomerRepo customerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<Customer> customer = customerRepository.findByEmail(username);
        if (customer.size() == 0) {
            throw new UsernameNotFoundException("User details not found for the user : " + username);
        }
        return new SecurityCustomer(customer.get(0));
    }

}
