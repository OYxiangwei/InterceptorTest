package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("login")
    public String login(HttpSession session , String name, String password , Model model){
        if(("阳祥伟").equals(name)&&("12345").equals(password)){
            session.setAttribute("name",name);
            return "redirect:test";
        }else {
            model.addAttribute("message","名称或者密码错误");
            return "loginform";
        }
    }

    @RequestMapping("loginout")
    public String loginout(HttpSession session) throws Exception{
        session.invalidate();
        return "loginform";
    }
}
