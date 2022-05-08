package com.example.service;

import java.util.List;
import java.util.ArrayList;  


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Books;
import com.example.repository.BooksRepository;
@Service
public class BooksService {
	
	@Autowired
	BooksRepository booksRepository; 
	
	public List<Books> getAllBooks()   
	{  
	List<Books> books = new ArrayList<Books>();  
	booksRepository.findAll().forEach(books1 -> books.add(books1));  
	return books;  
	} 
	
	
	public Books getBooksById(int id)   
	{  
	return booksRepository.findById(id).get();  
	}  
	
	
	public void saveOrUpdate(Books books)   
	{  
	booksRepository.save(books);  
	}  
	
	
	public void delete(int id)   
	{  
	booksRepository.deleteById(id);  
	}

	
	public void update(Books books, int bookid)   
	{  
	booksRepository.save(books);  
	} 
}
