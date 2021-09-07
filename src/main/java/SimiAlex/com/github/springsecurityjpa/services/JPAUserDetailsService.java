package SimiAlex.com.github.springsecurityjpa.services;

import SimiAlex.com.github.springsecurityjpa.entities.User;
import SimiAlex.com.github.springsecurityjpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


public class JPAUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findUserByUsername(s).orElseThrow(()->new UsernameNotFoundException("User not found"));
        return new SecurityUser(user);
    }
}
