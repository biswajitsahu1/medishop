package com.medishop.order.rapository;

import com.medishop.order.entites.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRapository extends JpaRepository<Contact,String> {

}
