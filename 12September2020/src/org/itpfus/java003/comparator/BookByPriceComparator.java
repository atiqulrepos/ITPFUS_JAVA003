package org.itpfus.java003.comparator;

import java.util.Comparator;
import org.itpfus.java003.books.Book;

public class BookByPriceComparator implements Comparator<Book> {

	@Override
	public int compare(Book arg0, Book arg1) {
		if (arg0.getPrice() < arg1.getPrice())
			return -1;
		else if (arg0.getPrice() == arg1.getPrice())
			return 0;
		else
			return 1;
	}

}
