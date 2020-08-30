package org.itpfus.java003.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.itpfus.java003.books.Book;
import org.itpfus.java003.comparator.BookByPriceComparator;

public class BookManager {

	//iterator iterates over a collection
	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		numbers.add(11);
		numbers.add(7);
		numbers.add(22);
		numbers.add(14);
		numbers.add(1);
		System.out.println(numbers);
		
		Iterator<Integer> nubmersIter = numbers.iterator(); 
		
		while(nubmersIter.hasNext()) {
			System.out.println(nubmersIter.next());
		}
		
//		int[] nums = {1,2,3,4};
//		for(int i = 0; i < nums.length; i++) {
//			System.out.println(nums[i]);
//		}
		
		Collections.sort(numbers);
		System.out.println(numbers);

		List<String> names = new ArrayList<>();
		names.add("Humayun");
		names.add("Aarosh");
		names.add("Soeb");
		names.add("Shaekh");
		names.add("Naqib");
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		
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
		
		System.out.println(books);
		Iterator<Book> booksIter = books.iterator();
		
		while(booksIter.hasNext()) {
			Book b = booksIter.next();
			System.out.println("Book name:" + b.getName());
			System.out.println("Authro:" + b.getAuthorFirstName() + " " + b.getAuthorLastName());
			System.out.println("Price:" + b.getPrice());
		}
		
		System.out.println("============================================");
		Collections.sort(books);
		booksIter = books.iterator();
		
		while(booksIter.hasNext()) {
			Book b = booksIter.next();
			System.out.println("Book name:" + b.getName());
			System.out.println("Authro:" + b.getAuthorFirstName() + " " + b.getAuthorLastName());
			System.out.println("Price:" + b.getPrice());
		}
		
		
/*		System.out.println(books);
		
		
		Collections.sort(books, new BookByPriceComparator());
		System.out.println(books);
		Iterator<Book> bookIter = books.iterator();
		while(bookIter.hasNext()) {
			System.out.println(bookIter.next().getPrice());
		}
	*/	
	}

}
