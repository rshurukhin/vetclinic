package controller;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import service.Storage;

@Controller
public class UserCreate {
    @RequestMapping(value = "app/create", method = RequestMethod.POST)
    public String createNewUser(WebRequest request){
        Storage.getInstance().addUser(new User(request.getParameter("userName"),
                request.getParameter("userSurname"), request.getParameter("login"),
                request.getParameter("password")));
        return "createUser";
    }

    @RequestMapping(value = "app/create", method = RequestMethod.GET)
    public String createUserRedirect(){
        return "createUser";
    }
}
