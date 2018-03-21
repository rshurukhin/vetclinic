package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import service.Storage;

@Controller
public class UserDelete {
    @RequestMapping(value = "app/users/delete")
    public ModelAndView deleteUser(WebRequest request){
        ModelAndView res = new ModelAndView();
        try {
            Storage.getInstance().deleteUser(Integer.parseInt(request.getParameter("userId")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        res.addObject("usersMap", Storage.getAllUsers());
        res.setViewName("usersView");
        return res;
    }
}
