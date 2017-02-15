package com.ugur.microservices;

import com.ugur.microservices.domain.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by ugurartun on 14/02/17.
 */
@Controller
public class HelloController
{
    @RequestMapping("/hi/{name}")
    public @ResponseBody String hiThere(Map model, @PathVariable String name)
    {
        model.put("name", name);
        return "Hello World";
    }

}
