package org.example;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(){
        return "index";
    }

    // Using HttpSession
    @RequestMapping("add")
    public String add(HttpServletRequest req, HttpSession session){
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;
        session.setAttribute("result",result);
        return "result";
    }


    // Using Model
    @RequestMapping("sub")
    public String sub(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model){
        int result = num1-num2;
        model.addAttribute("result",result);
        return "result";
    }



    // Using model and View
    @RequestMapping("div")
    public ModelAndView div(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView model){
        int result = (int)num1/num2;
        ModelAndView mv = model.addObject("result",result);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("mul")
    public String mul(@ModelAttribute("numComb") Nums num){
        return "result";
    }



}
