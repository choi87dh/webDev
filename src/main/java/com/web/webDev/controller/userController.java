package com.web.webDev.controller;

import com.web.webDev.domain.Member;
import com.web.webDev.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/users")
public class userController {


/*    @Autowired
    com.web.webDev.service.userService userService;

    public Member insertMember(Member member){
        return userService.insertMember(member);
    }

    public List<Member> getAllUsers(){
        return userService.getAllUsers();
    }

    public Member getUserById(String userId){
        return userService.getUserById(userId);
    }

    public void updateUserPw(String userId, Member member){
        userService.updateUserPw(userId, member);
    }

    public void deleteUser(String  userId){
        userService.deleteUser(userId);
    }*/
}
