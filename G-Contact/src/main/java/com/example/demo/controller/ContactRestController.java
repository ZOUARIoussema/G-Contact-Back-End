package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.enties.Contact;
import com.example.demo.service.IContactService;

@RestController
@CrossOrigin("*")
public class ContactRestController {

	@Autowired
	private IContactService contactservice;

	@GetMapping(value = "/contacts")
	@ResponseBody
	public List<Contact> getContacts() {

		return contactservice.getAll();

	}

	@GetMapping(value = "/chercherContacts")
	@ResponseBody
	public Page<Contact> chercherContacts(@RequestParam(name = "mc", defaultValue = "") String mc,
			@RequestParam(name = "page", defaultValue = "") int page,
			@RequestParam(name = "size", defaultValue = "5") int size) {

		return contactservice.chercherContacts("%" + mc + "%", PageRequest.of(page, size));

	}

	@GetMapping(value = "/contacts/{id}")
	@ResponseBody
	public Contact getContact(@PathVariable("id") Long id) {

		return contactservice.getById(id);

	}

	@PostMapping(value = "/contacts")
	@ResponseBody
	public Contact addContact(@RequestBody Contact c) {

		return contactservice.add(c);

	}

	@DeleteMapping(value = "/contacts/{id}")
	@ResponseBody
	public void deleteContact(@PathVariable("id") Long id) {

		contactservice.delete(id);

	}

	@PutMapping(value = "/contacts")
	@ResponseBody
	public Contact updateContact(@RequestBody Contact c) {

		return contactservice.add(c);

	}

}
