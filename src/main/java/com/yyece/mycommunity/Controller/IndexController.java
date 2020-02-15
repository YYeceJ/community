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
public class IndexController {
    @GetMapping("/")
    public String hello() {
        return "index";
    }
}
