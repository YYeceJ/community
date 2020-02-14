package com.yyece.mycommunity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

/**
 * Created with IntelliJ IDEA.
 * User: wo
 * Date: 2020/2/14
 * PACKAGE_NAME:com.yyece.mycommunity.Controller
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name,Model model) {
        model.addAttribute("name",name);
        return "hello";
    }
}
