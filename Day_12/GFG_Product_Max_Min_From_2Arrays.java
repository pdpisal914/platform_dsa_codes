/*
QUE:Product of maximum in first array and minimum in second

Given two arrays of A and B respectively of sizes N1 and N2, the task is to calculate the product of the maximum element of the first array and minimum element of the second array.

Example 1:

Input : A[] = {5, 7, 9, 3, 6, 2}, 
        B[] = {1, 2, 6, -1, 0, 9}
Output : -9
Explanation:
The first array is 5 7 9 3 6 2. 
The max element among these elements is 9.
The second array is 1 2 6 -1 0 9.
The min element among these elements is -1.
The product of 9 and -1 is 9*-1=-9.

Example 2:

Input : A[] = {0, 0, 0, 0}, 
           B[] = {1, -1, 2}
Output : 0

Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function find_multiplication() that takes an array of integer (A), another array of integer (B), size of array A(n), size of array B(m) and return the product of the max element of the first array and the minimum element of the second array. The driver code takes care of the printing.

Expected Time Complexity: O(N + M).
Expected Auxiliary Space: O(1).
 
*/

import java.util.*;
import java.io.*;
class Solution {
 	long find_multiplication (int arr[], int brr[], int n, int m) {
               	long max = Long.MIN_VALUE;
        	long min = Long.MAX_VALUE;
       
        	for(int i=0;i<n;i++){
            		if(max<arr[i]){
                		max = arr[i];
            		}
       		 }
        
        	for(int i=0;i<m;i++){
        	    if(min>brr[i]){
        	        min = brr[i];
        	    }
        	}
    	    return min*max;
    	}

    public static void main(String [] pdp) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter The Array Size");
	    int arr1[] = new int[Integer.parseInt(br.readLine())];

	    System.out.println("Enter The Array Elements");
	    for(int i=0;i<arr1.length;i++){
		    arr1[i]=Integer.parseInt(br.readLine());
	    }


	    System.out.println("Enter The Array 2 Size");
	    int arr2[]=new int[Integer.parseInt(br.readLine())];

	    System.out.println("Enter The Array 2 Elements");
	     for(int i=0;i<arr2.length;i++){
                    arr2[i]=Integer.parseInt(br.readLine());
            } 

	    Solution obj = new Solution();
	    System.out.println("Output : "+ obj.find_multiplication(arr1,arr2,arr1.length,arr2.length));
    }

}
