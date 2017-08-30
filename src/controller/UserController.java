package controller;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by WLP on 2017/8/3.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/Log")
    public String login(HttpServletRequest request,String userName, String password, ModelMap modelMap){
        try {
            userName = new String(userName.getBytes("ISO8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(userName+"oooooooooooo "+password);
        User user = userService.login(userName);
        if (user != null && (user.getPassword()).equals(password)) {
            List<User> users = userService.selectAll();
            modelMap.addAttribute("users",users);
            int number = userService.usersNum();
            request.setAttribute("records",number);
            return "index";
        }
        else
            return "login";
    }
}
