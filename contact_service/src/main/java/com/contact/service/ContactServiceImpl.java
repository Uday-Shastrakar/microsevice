package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
@Service
public class ContactServiceImpl implements ContactService{

	//fake list of contacts 
	List<Contact> list = List.of(
			new Contact(1L,"uday.shastrkar@gmail.com","uday",1114L),
			new Contact(2L,"uda.shastrkar@gmail.com","rohit",1311L),
			new Contact(3L,"uda.shastrkar@gmail.com","uda",1115L)
	);
	
	
	
	
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
