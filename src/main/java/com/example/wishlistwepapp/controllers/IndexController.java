package com.example.wishlistwepapp.controllers;

import com.example.wishlistwepapp.models.User;
import com.example.wishlistwepapp.services.UserService;
import com.example.wishlistwepapp.services.WishService;
import com.example.wishlistwepapp.services.WishlistService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    private final WishlistService wls = WishlistService.getInstance();
    private final WishService ws = WishService.getInstance();
    private final UserService us = UserService.getInstance();




    @GetMapping("/")
    public String index(){
        return "index";
    }


    @GetMapping("/signin")
    public String signIn(){
        return "sign_in";
    }


    @GetMapping("/signup")
    public String signUp(){
        return "sign_up";
    }


    //work in progress :)
    /*
    @GetMapping("/register")
    @ResponseBody
    public String showSignUp(HttpServletRequest req, Model model){
        //setSession(req);

        model.addAttribute("user", req.getSession());

        return "sign_in";
    }

    @GetMapping("/sign-in")
    @ResponseBody
    public String setSignInSession(HttpServletRequest request, @RequestParam String name, String email, String password){
        HttpSession session = request.getSession();
        User currUser = us.createUser(name, email, password);
        session.setAttribute("currUser", currUser);

        return "sign_in";
    }

    @GetMapping("/sign-up")
    @ResponseBody
    public String setSignUpSession(HttpServletRequest request){
        HttpSession session = request.getSession();
        User currUser = us.createUser("John", "generic@dog.com", "123");
        session.setAttribute("currUser", currUser);

        return "sign_in";
    }



    @GetMapping("/get-session")
    @ResponseBody
    public String getSession(HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("currUser");

        return user.toString();
    }
     */



}
