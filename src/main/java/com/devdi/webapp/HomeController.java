package com.devdi.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by devdi on 3/1/14.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private MessageService messageService;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(Model model) {
        newMessage(model);
        return "home";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String sendMessage(Model model, Message message) {
        messageService.sendMessage(message);
        newMessage(model);
        return "home";
    }


    private void newMessage(Model model) {
        model.addAttribute("message", new Message());
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
}