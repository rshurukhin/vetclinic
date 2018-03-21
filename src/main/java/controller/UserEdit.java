package controller;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import service.Storage;

@Controller
public class UserEdit {
    @RequestMapping(value = "/app/users/edit")
    public ModelAndView editUser(WebRequest request){
        ModelAndView res = new ModelAndView();
        try {
            User user = Storage.getInstance().getUser(Integer.parseInt(request.getParameter("userId")));
            res.addObject("user", user);
            res.setViewName("editUser");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @RequestMapping(value = "/app/users/edit", method = RequestMethod.POST)
    public ModelAndView saveUserChanges(WebRequest request){
        ModelAndView res = new ModelAndView();
        try {
            User user = Storage.getInstance().getUser(Integer.parseInt(request.getParameter("userId")));
            user.setUserName(request.getParameter("userName"));
            user.setUserSurname(request.getParameter("userSurname"));
            user.setLogin(request.getParameter("login"));
            user.setPassword(request.getParameter("password"));
            Storage.getInstance().addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return editUser(request);
    }
}
