package org.itpfus.java003.books;

public class Book implements Comparable<Book> {
	private String title;
	private String authorFirstName;
	private String authorLastName;
	private double price;

	public Book(String title, String authorFirstName, String authorLastName, double price) {
		this.title = title;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
		this.price = price;
	}

	private Book() {
		
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}
	
	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [Title=" + title + ", First Name=" + authorFirstName + ", Last Name=" + authorLastName + ", Price=" + price + "]";
	}

	@Override
	public int compareTo(Book o) {
		if (this.title.charAt(0) < o.getTitle().charAt(0))
			return -1;
		else if (this.title.charAt(0) == o.getTitle().charAt(0))
			return 0;
		else
			return 1;
	}

}
