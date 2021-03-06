package com.tcode.bookstore.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tcode.bookstore.controller.Books;

@Service
public class BookService {
	
	private List<Books> books = new ArrayList<>(Arrays.asList(
			new Books("001", "Spring 101", "Spring framework Book "),
			new Books("002", "Spring 102", "Spring MVC Book "),
			new Books("003", "Spring 103", "Spring Boot Book ")
			));
	
	public List<Books> getAllBooks(){
		
		return books;
	}
	
	public Books getBook(String id) {
		
		return books.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}

	public void addBook(Books b) {
		books.add(b);
	}

	public void updateBook(String id, Books b) {
		
		for(int i=0;i<=books.size();i++) {
			Books bk = books.get(i);
			if(bk.getId().equals(id)) {
				books.set(i, b);
			return;
			}
				
			
		}
		
	}

}
