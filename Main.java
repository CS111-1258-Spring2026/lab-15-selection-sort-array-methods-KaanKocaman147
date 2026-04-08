/********************************************
*	AUTHOR:	Kaan
* COLLABORATORS: None
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED:	April 8, 2026
********************************************/
public class Main 
{
  public static void main(String[] args)
  {
    int[] numbers = {42, 16, 84, 12, 77, 26, 53};

    // Print original
    System.out.println("Original: " + ArrayMethods.arrayString(numbers));

    // Test reverse
    ArrayMethods.reverse(numbers);
    System.out.println("Reversed: " + ArrayMethods.arrayString(numbers));

    // Sort array
    ArrayMethods.selectionSort(numbers);
    System.out.println("Sorted: " + ArrayMethods.arrayString(numbers));
  }
}