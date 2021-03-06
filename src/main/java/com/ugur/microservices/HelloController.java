package com.ugur.microservices;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by ugurartun on 14/02/17.
 */
@Controller
public class HelloController
{
    @Transactional(propagation = Propagation.REQUIRED)
    @RequestMapping("/hi/{name}")
    public @ResponseBody String hiThere(Map model, @PathVariable String name)
    {
        model.put("name", name);
        return "Hello World";
    }

}
