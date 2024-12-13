package com.qa.Relationship;

import java.util.ArrayList;
import java.util.List;

public class Books {

	private String bookName;
	private String authorName;
	private List<Books> booksList = new ArrayList<>();
	
	
	public List<Books> getBooksList() {
		return booksList;
	}
	
	  public void addBook(Books book) {
	        booksList.add(book);
	    }
	public void setBooksList(List<Books> booksList) {
		this.booksList = booksList;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	

}
