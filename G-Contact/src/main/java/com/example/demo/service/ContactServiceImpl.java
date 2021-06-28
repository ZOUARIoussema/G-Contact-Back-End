package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ContactRepository;
import com.example.demo.enties.Contact;
@Service
public class ContactServiceImpl implements IContactService {

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public Page<Contact> chercherContacts(String mc, Pageable pageable) {
		return contactRepository.chercher(mc, pageable);
	}

	@Override
	public void delete(long id) {
		contactRepository.deleteById(id);

	}

	@Override
	public Contact update(Contact c) {
		return contactRepository.save(c);
	}

	@Override
	public Contact add(Contact c) {
		return contactRepository.save(c);
	}

	@Override
	public List<Contact> getAll() {
		return contactRepository.findAll();
	}

	@Override
	public Contact getById(long id) {
		return contactRepository.findById(id).orElse(null);
	}

}
