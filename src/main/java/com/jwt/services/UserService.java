package com.jwt.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.models.User;

@Service
public class UserService {
    
    private List<User> store = new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(), "Paras Bagga", "Parasbagga23@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Shivam Bagga", "Parasbagga23@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Aarushi Mahajan", "Parasbagga23@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Twinkle Mahajan", "Parasbagga23@gmail.com"));
    }

    public List<User> getUsers()
    {
        return this.store;
    }
}
