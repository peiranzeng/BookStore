package com.storeweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.storeweb.domain.Book;
import com.storeweb.repository.BookRepository;
import com.storeweb.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> findAll() {

		List<Book> bookList = (List<Book>) bookRepository.findAll();
		List<Book> activeBookList = new ArrayList<>();
		for (Book book : bookList) {
			if (book.isActive()) {
				activeBookList.add(book);
			}
		}
		return activeBookList;
	}

	@Override
	public Book findOne(Long id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id).orElse(null);
	}

	@Override
	public List<Book> findByCategory(String category) {
		// TODO Auto-generated method stub
		List<Book> bookList = bookRepository.findByCategory(category);

		List<Book> activeBookList = new ArrayList<>();

		for (Book book : bookList) {
			if (book.isActive()) {
				activeBookList.add(book);
			}
		}
		return activeBookList;
	}

	@Override
	public List<Book> blurrySearch(String keyword) {
		// TODO Auto-generated method stub
		List<Book> bookList = bookRepository.findByTitleContaining(keyword);
		List<Book> activeBookList = new ArrayList<>();

		for (Book book : bookList) {
			if (book.isActive()) {
				activeBookList.add(book);
			}
		}
		return activeBookList;
	}

}
