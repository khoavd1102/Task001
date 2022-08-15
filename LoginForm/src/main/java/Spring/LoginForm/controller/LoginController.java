package Spring.LoginForm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String welcomePage(ModelMap model, @RequestParam String userName, @RequestParam String password){
        if(userName == "admin" && password == "admin"){
            return "welcome";
        }
        model.put("errorMsg", "Please provide the correct user name and password");
        return "welcome";
    }
}
