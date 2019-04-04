
/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		//testPositive();
		//testNegative();
		testMixed();
		testDuplicates();
	}

	public testSelectionSort() {
	}

	public void testPositive() {

		SelectionSort ssort = new SelectionSort();

		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;

		arr = ssort.basicSelectionSort(arr);

		assertArrayEquals("Array of positives are not equal", Sortedarr, arr);

	}

	public void testNegative() {

		SelectionSort ssort = new SelectionSort();

		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -9;
		Sortedarr[2] = -8;
		Sortedarr[3] = -7;
		Sortedarr[4] = -2;

		arr = ssort.basicSelectionSort(arr);

		assertArrayEquals("Array of negatives are not equal", Sortedarr, arr);
	}

	public void testMixed() {

		SelectionSort ssort = new SelectionSort();

		int[] arr = {11, 3, 0, 7, -4, -10};
		int[] Sortedarr = {-10, -4, 0, 3, 7, 11};

		arr = ssort.basicSelectionSort(arr);

		assertArrayEquals("Array of mixed input are not equal", Sortedarr, arr);
	}

	public void testDuplicates() {

		SelectionSort ssort = new SelectionSort();

		int[] arr = {1, 1, -3, -2, -3};
		int[] Sortedarr = {-3, -3, -2, 1, 1};

		arr = ssort.basicSelectionSort(arr);

		assertArrayEquals("Array of duplicates are not equal", Sortedarr, arr);
	}
}
