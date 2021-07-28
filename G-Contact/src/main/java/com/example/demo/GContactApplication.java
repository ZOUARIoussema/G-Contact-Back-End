package com.example.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.ContactRepository;
import com.example.demo.enties.Contact;

@SpringBootApplication
public class GContactApplication implements CommandLineRunner {

	@Autowired
	ContactRepository contactRepository;

	public static void main(String[] args) {
		SpringApplication.run(GContactApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		DateFormat d = new SimpleDateFormat("dd/MM/yyyy");

		contactRepository.save(new Contact("zouari", "oussema", d.parse("30/09/1995"), "oussema.zouari@esprit.tn",
				24812689, "photo.png"));
		contactRepository.save(new Contact("zouari", "ahmed", d.parse("30/09/1995"), "ahmed.zouari@esprit.tn", 29777896,
				"photo1.png"));
		contactRepository.save(
				new Contact("zouari", "ali", d.parse("30/09/1995"), "ali.zouari@esprit.tn", 21455456, "photo2.png"));
		contactRepository.save(
				new Contact("foulen", "ali", d.parse("30/09/1995"), "ali.zouari@esprit.tn", 21455456, "photo2.png"));
		contactRepository.save(
				new Contact("foulen", "ali", d.parse("30/09/1995"), "ali.zouari@esprit.tn", 21455456, "photo2.png"));
		contactRepository.save(
				new Contact("foulen", "ali", d.parse("30/09/1995"), "ali.zouari@esprit.tn", 21455456, "photo2.png"));
		contactRepository.save(
				new Contact("foulen", "ali", d.parse("30/09/1995"), "ali.zouari@esprit.tn", 21455456, "photo2.png"));
		contactRepository.save(
				new Contact("foulen", "ali", d.parse("30/09/1995"), "ali.zouari@esprit.tn", 21455456, "photo2.png"));
		contactRepository.save(
				new Contact("foulen", "ali", d.parse("30/09/1995"), "ali.zouari@esprit.tn", 21455456, "photo2.png"));
		contactRepository.save(
				new Contact("foulen", "ali", d.parse("30/09/1995"), "ali.zouari@esprit.tn", 21455456, "photo2.png"));
		contactRepository.save(
				new Contact("foulen", "ali", d.parse("30/09/1995"), "ali.zouari@esprit.tn", 21455456, "photo2.png"));
		contactRepository.save(
				new Contact("foulen", "ali", d.parse("30/09/1995"), "ali.zouari@esprit.tn", 21455456, "photo2.png"));

		contactRepository.findAll().forEach(c -> {
			System.out.println(c.getNom());
		});

	}

}
