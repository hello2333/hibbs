package com.zhning.hibbs;

import com.google.common.collect.Maps;
import com.zhning.hibbs.dao.BaseDao;
import com.zhning.hibbs.dao.UserDao;
import com.zhning.hibbs.dao.impl.BaseDaoImpl;
import com.zhning.hibbs.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/zhning")
public class HelloController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String printWelcome(ModelMap model) {
        HashMap<String, Integer> user = Maps.newHashMap();
        user.put("id", 1);
        List<User> res = userDao.findByProp(user);
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