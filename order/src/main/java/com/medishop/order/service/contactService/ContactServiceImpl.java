package com.medishop.order.service.contactService;

import com.medishop.order.entites.Contact;
import com.medishop.order.rapository.ContactRapository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactRapository contactRapository;

    @Override
    public void createMedicine(Contact contact) {
        String contactId = UUID.randomUUID().toString();
        contact.setContactId(contactId);
        contactRapository.save(contact);
    }
}
