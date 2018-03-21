package controller;

import service.Storage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersView {
    @RequestMapping(value = "/app/users", method = RequestMethod.GET)
    public ModelAndView getAllUsers(){
        ModelAndView res = new ModelAndView();
        res.addObject("usersMap", Storage.getAllUsers());
        res.setViewName("usersView");

        return res;
    }

    @RequestMapping("/app")
    public String home(){
        return "index";
    }

}
