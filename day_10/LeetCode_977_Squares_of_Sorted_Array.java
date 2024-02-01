/*
977. Squares of a Sorted Array
Solved
Easy
Topics
Companies
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 
*/
import java.util.*;
import java.io.*;
class Solution {
    static int[] sortedSquares(int[] arr) {
        
	    for(int i=0;i<arr.length;i++){
		    arr[i]=arr[i]*arr[i];
	    }
	    Arrays.sort(arr);
	    return arr;
    }
    public static void main(String [] pdp) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter The Array Length");
	    int arr[] = new int[Integer.parseInt(br.readLine())];

	    System.out.println("Enter The Array Elements");
	    for(int i=0;i<arr.length;i++){
		    arr[i]=Integer.parseInt(br.readLine());
	    }

	    System.out.println("Sorted Squares : "+ Arrays.toString(sortedSquares(arr)));
    }
}
