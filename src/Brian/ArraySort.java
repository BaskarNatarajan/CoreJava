/**
 * 
 */
package Brian;

import java.util.Arrays;

/**
 * @author BASKAR
 *
 */
public class ArraySort {

	ArraySort() {
		String[] str = new String[] { "Pineapple", "Apple", "Orange", "Banana" };
		Arrays.sort(str); // Sorting the array

		for (String i : str) // enhanced for loop
		{
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySort ar = new ArraySort();
	}

}
