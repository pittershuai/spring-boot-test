package com.zslin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zslin.com on 2016/10/13.
 */
//@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用。
@RestController
public class IndexController {

    @RequestMapping(value = "index")
    public String index() {

        return "Hello World!!!";
    }
}
