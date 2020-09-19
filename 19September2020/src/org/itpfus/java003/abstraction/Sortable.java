package org.itpfus.java003.abstraction;

abstract class sorting{
	public int[] sort(int[] arr) {
		return arr;
	}
}

public interface Sortable {

	int[] sort(int[] arr);

}