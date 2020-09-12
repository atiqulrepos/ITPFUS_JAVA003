package org.itpfus.java003.comparator;

import org.itpfus.java003.books.Book;
import java.util.Comparator;

public class BooksAuthorLastName implements Comparator<Book> {

	@Override
	public int compare(Book arg0, Book arg1) {
		if (arg0.getAuthorLastName().charAt(0) < arg1.getAuthorLastName().charAt(0))
			return -1;
		else if (arg0.getAuthorLastName().charAt(0) == arg1.getAuthorLastName().charAt(0))
			return 0;
		else
			return 1;
	}
}