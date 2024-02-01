/*
Product array puzzle
EasyAccuracy: 33.46%Submissions: 189K+Points: 2
30+ People have Claimed their 90% Refunds. Start Your Journey Today! 

banner
Given an array nums[] of size n, construct a Product Array P (of same size n) such that P[i] is equal to the product of all the elements of nums except nums[i].

 

Example 1:

Input:
n = 5
nums[] = {10, 3, 5, 6, 2}
Output:
180 600 360 300 900
Explanation: 
For i=0, P[i] = 3*5*6*2 = 180.
For i=1, P[i] = 10*5*6*2 = 600.
For i=2, P[i] = 10*3*6*2 = 360.
For i=3, P[i] = 10*3*5*2 = 300.
For i=4, P[i] = 10*3*5*6 = 900.
Example 2:

Input:
n = 2
nums[] = {12,0}
Output:
0 12

Your Task:
You do not have to read input. Your task is to complete the function productExceptSelf() that takes array nums[] and n as input parameters and returns a list of n integers denoting the product array P. If the array has only one element the returned list should should contains one value i.e {1}
Note: Try to solve this problem without using the division operation.
 

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)
 

Constraints:
1 <= n <= 1000
0 <= numsi <= 200
Array may contain duplicates.
*/

import java.util.*;
import java.io.*;
class Solution {
    	static long[] productExceptSelf(int arr[], int n) 
	{
		long proArr[] = new long[n];
	       long pro = 1;
	       boolean flag = false;
		for(int i=0;i<n;i++){
	       		if(arr[i]==0){
				flag = true;
			}else{
				pro=pro*arr[i];
			}
	       }

	       for(int i=0;i<n;i++){
	       		if(flag == true){
				if(arr[i] == 0){
					proArr[i]=pro;
				}else{
					proArr[i]=0;
				}
			}else{
				proArr[i]=pro/arr[i];
			}
	       }

	       return proArr;

	} 
    public static void main(String [] pdp) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter The Array Length");
	    int arr[] = new int[Integer.parseInt(br.readLine())];

	    System.out.println("Enter The Array Elements");
	    for(int i=0;i<arr.length;i++){
		    arr[i]=Integer.parseInt(br.readLine());
	    }

	    System.out.println("Product Array : "+ Arrays.toString(productExceptSelf(arr,arr.length)));
    }
}
