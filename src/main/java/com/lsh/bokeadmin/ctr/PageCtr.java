package com.lsh.bokeadmin.ctr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageCtr {
    
    @RequestMapping("/{page}")
    public String toPage(@PathVariable("page") String page) {
        if (page.isEmpty()) {
            return "index";
        }
        return page;
    }
    
}
