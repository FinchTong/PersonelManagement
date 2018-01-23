package com.tong.pm.controller;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.tong.pm.model.*;
import com.tong.pm.service.RoleManage;
import com.tong.pm.service.UserManage;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @Autowired
    UserManage userManage;

    @Autowired
    RoleManage roleManage;

    @RequestMapping(value = {"/welcome**"}, method = RequestMethod.GET)
    public String welcomePage(ModelMap model) {
        model.addAttribute("title", "Hello World!");
        model.addAttribute("message", "This is welcome page!");
        return "hello";
    }

    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView adminPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Secutiry Hello World");
        model.addObject("message", "This is protected page!");
        model.setViewName("admin");
        return model;
    }

    @RequestMapping(value = "/addRole", method = RequestMethod.GET)
    public String addRoleView() {
        return "AddRoleHtml";
    }

    @RequestMapping(value = "/connectMongodb", method = RequestMethod.GET)
    @ResponseBody
    public String testConnectMongodb() {
        StringBuffer message = new StringBuffer();
        try {
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            MongoDatabase mongoDatabase = mongoClient.getDatabase("tutorial");
            message.append("Connect to database successfully </br>");
            MongoCollection<Document> collection = mongoDatabase.getCollection("movie");
            FindIterable<Document> findIterable = collection.find();
            MongoCursor<Document> mongoCursor = findIterable.iterator();
            while(mongoCursor.hasNext()){
                message.append(mongoCursor.next()).append(" <br/> ");
            }
        } catch (Exception e) {
            message = new StringBuffer(e.getMessage());
        }
        return message.toString();
    }

}
