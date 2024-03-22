package com.akash.main;

import java.util.Scanner;

class Book{
	private String title;
	private String author;
	private String publisher;
	private String isbn;
	private int year;
	private double price;
	private int quantity;
	
	public Book()
	{
		this.author=null;
		this.title = null;
		this.isbn = null;
		this.price = 0.0;
		this.publisher = null;
		this.year = 0;
		this.quantity = 0;
		
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public String getTitle() {
		return title;
	}
	public int getYear() {
		return year;
	}
	
	public int increaseQuantity(int n)
	{
		
		int a = this.quantity + n;
		return a;
	
	}
	
	public int decreaseQuantity()
	{
		return this.quantity--;
	}
	
	public void getInventiry()
	{
		
		System.out.println("Inventary  :"+(this.price*this.quantity));
	}
	
}




public class Program {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Book b = new Book();
		b.setQuantity(12);
		b.setPrice(200);
		
		
		System.out.println("Quantity  :"+b.getQuantity());
		System.out.print("Enter the no of quantity  :");
		System.out.println("New Quantity :"+b.increaseQuantity(sc.nextInt())+" "+b.decreaseQuantity());
		b.getInventiry();
		
		
		
	}
}
