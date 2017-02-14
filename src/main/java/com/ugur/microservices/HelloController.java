package com.ugur.microservices;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ugurartun on 14/02/17.
 */
@Controller
public class HelloController
{
    @RequestMapping("/hi")
    public @ResponseBody String hiThere()
    {
        return "Hello World";
    }
}
