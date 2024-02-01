/*

Smallest subarray with sum greater than x
EasyAccuracy: 37.07%Submissions: 112K+Points: 2
30+ People have Claimed their 90% Refunds. Start Your Journey Today! 

banner
Given an array of integers (A[])  and a number x, find the smallest subarray with sum greater than the given value. If such a subarray do not exist return 0 in that case.

Example 1:

Input:
A[] = {1, 4, 45, 6, 0, 19}
x  =  51
Output: 3
Explanation:
Minimum length subarray is 
{4, 45, 6}

Example 2:
Input:
A[] = {1, 10, 5, 2, 7}
   x  = 9
Output: 1
Explanation:
Minimum length subarray is {10}
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function smallestSubWithSum() which takes the array A[], its size N and an integer X as inputs and returns the required ouput.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N, x ≤ 105
0 ≤ A[] ≤ 104

*/

import java.io.*;
import java.util.*;
class Solve {

	static int minLength(int []arr,int n){

		int start =0,end = 1;
		int sum = arr[start];

		int result = Integer.MAX_VALUE;

		if(Sum>x){
			return 1;
		}
		if(end<n){
			sum = sum+arr[end];
		}

		while(start<n && end<n){

			if(sum>x){
				result = Math.min(result,end-start+1);
				sum = sum - arr[start];
				start++;
			}else{
				end++;
				if(end<n){
					sum = sum + arr[end];
				}
			}
		}
		if(result==Integer.MAX_VALUE){
			return 0;
		}
		return result;
	}

    public static void main(String [] pdp) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter The Array Length");
	    int arr[] = new int[Integer.parseInt(br.readLine())];

	    System.out.println("Enter The Array Elements");
	    for(int i=0;i<arr.length;i++){
		    arr[i]=Integer.parseInt(br.readLine());
	    }

	    System.out.println("O/p : "+minLength(arr,arr.length));
    }


}
