/********************************************
*	AUTHOR:	Kaan
* COLLABORATORS: None
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED: April 8, 2026
********************************************/

/********************************************
*	ArrayMethods
*********************************************
*	PROGRAM DESCRIPTION:
*	Collection of useful methods for int arrays.
*********************************************
*	ALGORITHM:
*	Selection Sort Pseudocode:
*
*	FOR each index i from 0 to array length - 1
*	    FIND index of smallest element starting at i
*	    SWAP element at i with element at min index
*	END FOR
*
*	Array will be sorted in ascending order
*********************************************

/* UML CLASS DIAGRAM:
-----------------------------------------
ArrayMethods
-----------------------------------------
-----------------------------------------
+ arrayString(array : int[]) : String //static
+ swap(array : int[], a : int, b : int) : void //static
+ indexOfMin(array : int[], startIndex : int) : int //static
+ reverse(array : int[]) : void //static
+ selectionSort(array : int[]) : void //static
-----------------------------------------
*/

public class ArrayMethods 
{
    // Step 1: Convert array to formatted string
    public static String arrayString(int[] arr) 
    {
        String result = "{ ";
        
        for (int i = 0; i < arr.length; i++) 
        {
            result += arr[i];
            
            if (i < arr.length - 1) 
            {
                result += ", ";
            }
        }
        
        result += " }";
        return result;
    }

    // Step 2: Swap two elements
    public static void swap(int[] arr, int i, int j) 
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Step 3: Find index of minimum starting from a given index
    public static int indexOfMin(int[] arr, int startIndex) 
    {
        int minIndex = startIndex;

        for (int i = startIndex + 1; i < arr.length; i++) 
        {
            if (arr[i] < arr[minIndex]) 
            {
                minIndex = i;
            }
        }

        return minIndex;
    }

    // Step 4: Reverse the array
    public static void reverse(int[] arr) 
    {
        for (int i = 0; i < arr.length / 2; i++) 
        {
            swap(arr, i, arr.length - 1 - i);
        }
    }

    // Step 5: Selection Sort
    public static void selectionSort(int[] arr) 
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            int minIndex = indexOfMin(arr, i);
            swap(arr, i, minIndex);
        }
    }
}