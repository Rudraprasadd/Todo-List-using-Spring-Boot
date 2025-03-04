package com.basictodo.springboot.FirstSpringWebApp.login;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;



@Controller
@SessionAttributes("name")
public class LoginController {

    private Authentication authentication;

    public LoginController(Authentication authentication){
        super();
        this.authentication=authentication;
    }

    @RequestMapping(value="/login",method =RequestMethod.GET)
    public String gotologin(){
        return("login");
    }

    @RequestMapping(value="/login",method =RequestMethod.POST)
    public String gotowelcome(@RequestParam String name,@RequestParam String password,ModelMap model){

        if(authentication.authenticate(name,password)){

        model.put("name",name);
        model.put("password",password);
        return("welcome");
 
        //Authenticate 

        }
        model.put("Error","Invalid Credentials");
        return("login");
    }
}
