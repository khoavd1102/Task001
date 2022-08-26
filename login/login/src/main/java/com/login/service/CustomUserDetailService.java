package com.login.service;

import com.login.mapper.UserMapper;
import com.login.model.User;
import com.login.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andEmailEqualTo(username);

        List<User> userList = userMapper.selectByExample(userExample);

        if (userList.size() > 0){
            User user = userList.get(0);

            List<GrantedAuthority> grantedAuthorityList = new ArrayList<GrantedAuthority>();
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ADMIN");
            grantedAuthorityList.add(grantedAuthority);

            UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getEmail(), user.getUserPassword(), grantedAuthorityList);
            System.out.println(user.getUserName());
            return userDetails;
        } else {
            new UsernameNotFoundException("Login fail !");
        }

        return null;
    }
}
