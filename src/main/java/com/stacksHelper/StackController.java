package com.stacksHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StackController {

    @Autowired
    StackUtil stackUtil;

    @RequestMapping(value =  "/push/{id}")
    @ResponseBody
    public String push(@PathVariable Integer id)
    {
        try {
            stackUtil.push(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "value inserted";
    }

    @RequestMapping(value = "/pop")
    @ResponseBody
    public String pop()
    {
        try {
            stackUtil.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "value removed";
    }

}
