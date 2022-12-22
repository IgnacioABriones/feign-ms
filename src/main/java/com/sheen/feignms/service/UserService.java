package com.sheen.feignms.service;


import com.sheen.feignms.client.UserFeignClient;
import com.sheen.feignms.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserFeignClient client;
    public List<UserDTO> getUsers(){
        List<UserDTO> response = client.getUsers();
        return response;
    }

    public void saveUser(UserDTO user){
        client.saveUser(user);
    }

    public void updateUser(Integer id, UserDTO user){
        client.updateUser(id, user);
    }

    public void deleteUser(Integer id){
        client.deleteUser(id);
    }

}
