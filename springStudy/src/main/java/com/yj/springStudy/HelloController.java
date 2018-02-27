package com.yj.springStudy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springStudy")
public class HelloController {
    @RequestMapping("index")
    public void helloMain(Model model) {
        System.out.println("Hello Spring");

    }

    @RequestMapping("page.do")
    public String onoffmixMain() {
        return "index";
    }
}
