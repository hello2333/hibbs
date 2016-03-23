package com.zhning.hibbs;

import com.google.common.collect.Maps;
import com.zhning.hibbs.mapper.UserMapper;
import com.zhning.hibbs.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/zhning")
public class HelloController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String printWelcome(ModelMap model) {
        HashMap<String, Integer> user = Maps.newHashMap();
        user.put("id", 1);
        List<User> res = userMapper.findByProp(user);
        return res.get(0).toString();
    }

    /*@RequestMapping(value = {"/index/{id}","index2"}, method = RequestMethod.GET)
    public ModelAndView getIndex(@PathVariable(value = "id")Integer num){
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.addObject("message", num);
	modelAndView.setViewName("hello");
        //ServletRequestUtils
        //ValidationUtils
        *//*Class clazz = HelloController.class;
        clazz.isAnnotationPresent()*//*
	return modelAndView;
    }*/
}