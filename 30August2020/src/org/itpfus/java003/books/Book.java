package org.itpfus.java003.books;

public class Book implements Comparable<Book> {
	private String name;
	private String authorFirstName;
	private String authorLastName;
	private double price;

	public Book(String name, String authorFirstName, String authorLastName, double price) {
		this.name = name;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Book [name=" + name + ", firstName=" + authorFirstName + ", lastName=" + authorLastName + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Book o) {
		if (this.name.charAt(0) < o.getName().charAt(0))
			return -1;
		else if (this.name.charAt(0) == o.getName().charAt(0))
			return 0;
		else
			return 1;
	}

}
