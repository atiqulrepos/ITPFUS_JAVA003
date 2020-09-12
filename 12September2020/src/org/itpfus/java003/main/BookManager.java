package org.itpfus.java003.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.itpfus.java003.books.Book;
import org.itpfus.java003.comparator.BookByPriceComparator;
import org.itpfus.java003.comparator.BooksAuthorLastName;

public class BookManager {

	//iterator iterates over a collection
	public static void main(String[] args) {
		//Book b = new Book("Java my Guide", "John", "Doe", 85.99);
		
		List<Book> books = new ArrayList<>();
		books.add(new Book("Library Book","Susan", "Orlean", 16.79));
		books.add(new Book("Someone We Know","Shari", "Lapena", 13.60));
		books.add(new Book("Walking the Americas","Levison", "Wood", 13.99));
		books.add(new Book("You Are a Mogul : How to Do the Impossible, Do It Yourself, and Do It Now","Tiffany", "Pham", 20.12));
		books.add(new Book("Perfect Girlfriend","Karen", "Hamilton", 12.58));
		books.add(new Book("Children of Blood and Bone","Tomi", "Adeyemi", 12.99));
		books.add(new Book("The Night Country","Melissa", "Albert", 12.37));
		books.add(new Book("Franklin & Washington","Edward J", "Larson", 22.05));
		books.add(new Book("This Is How It Always Is","Laurie", "Frankel", 9.98));
		books.add(new Book("Looking for Alaska","John", "Green", 8.99));
		books.add(new Book("Sadie","Courtney", "Summers", 14.96));
		
		//System.out.println(books);
		Iterator<Book> booksIter = books.iterator();
		
		while(booksIter.hasNext()) {
			Book b = booksIter.next();
			System.out.println("Book name:" + b.getTitle());
			System.out.println("Author:" + b.getAuthorFirstName() + " " + b.getAuthorLastName());
			System.out.println("Price:" + b.getPrice());
		}
		
		System.out.println("============================================");
		Collections.sort(books);
		booksIter = books.iterator();
		
		while(booksIter.hasNext()) {
			Book b = booksIter.next();
			System.out.println("Book name:" + b.getTitle());
			System.out.println("Author:" + b.getAuthorFirstName() + " " + b.getAuthorLastName());
			System.out.println("Price:" + b.getPrice());
		}
		
		//using custom sort
		Collections.sort(books, new BooksAuthorLastName());
		booksIter = books.iterator();
		while(booksIter.hasNext()) {
			Book bo = booksIter.next();
			System.out.println("Author Last Name: " + bo.getAuthorLastName() + ", Price: " + bo.getPrice());
		}
		
		//sorting a Set
		//set cannot be sorted using Collections.sort method. we need to convert it into a list first, then sort
		Set<String> cities = new HashSet<>();
		cities.add("New York");
		cities.add("Los Angeles");
		cities.add("Chicago");
		List<String> citiesList = new ArrayList<String>(cities); 
		Collections.sort(citiesList);
		
		System.out.println(citiesList);
		
	}

}
