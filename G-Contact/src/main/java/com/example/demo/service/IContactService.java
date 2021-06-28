package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.enties.Contact;

public interface IContactService {
	
	
	 
	public Page<Contact> chercherContacts(String mc,Pageable pageable);
	public void delete(long id);
	public Contact update(Contact c);
	public Contact add(Contact c);
	public List<Contact> getAll();
	public Contact getById(long id);
	
	

}
