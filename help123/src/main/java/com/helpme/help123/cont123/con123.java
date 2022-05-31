package com.helpme.help123.cont123;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class con123 {
    @RequestMapping(value="s",method= RequestMethod.GET)
    public static String c1(){
        return "i hate mm everyone";
    }
}
