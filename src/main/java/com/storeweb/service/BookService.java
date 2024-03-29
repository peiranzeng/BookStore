package com.storeweb.service;



import java.util.List;

import com.storeweb.domain.Book;


public interface BookService {
	List<Book> findAll ();
	
	Book findOne(Long id);

	List<Book> findByCategory(String category);

	List<Book> blurrySearch(String keyword);
}
