package com.medishop.order.controller;

import com.medishop.order.entites.Contact;
import com.medishop.order.service.contactService.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/user/contacts")
    public String UserContact(Model model){
        Contact contact = new Contact();
        model.addAttribute("contact",contact);
        return "contact";
    }

    @PostMapping("/user/contacts/save")
    public String createPost(@ModelAttribute("contact") Contact contact, Model model){
        contactService.createMedicine(contact);
        System.out.println("insert");
        return "redirect:/user/contacts?success";
    }
}
