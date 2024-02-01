/*
Array Subset of another array
BasicAccuracy: 44.05%Submissions: 276K+Points: 1
30+ People have Claimed their 90% Refunds. Start Your Journey Today! 

banner
Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted. There can be duplicate elements.
 

Example 1:

Input:
a1[] = {11, 7, 1, 13, 21, 3, 7, 3}
a2[] = {11, 3, 7, 1, 7}
Output:
Yes
Explanation:
a2[] is a subset of a1[]

Example 2:

Input:
a1[] = {1, 2, 3, 4, 4, 5, 6}
a2[] = {1, 2, 4}
Output:
Yes
Explanation:
a2[] is a subset of a1[]

Example 3:

Input:
a1[] = {10, 5, 2, 23, 19}
a2[] = {19, 5, 3}
Output:
No
Explanation:
a2[] is not a subset of a1[]
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function isSubset() which takes the array a1[], a2[], its size n and m as inputs and return "Yes" if arr2 is subset of arr1 else return "No" if arr2 is not subset of arr1.
*/
import java.io.*;
import java.util.*;
class Solution{

	static String isSubset( long arr1[], long arr2[], long n, long m) {

		HashMap<Long,Integer> hm = new HashMap<>();

		for(long num:arr1){
			if(hm.containsKey(num)){
				hm.put(num,hm.get(num)+1);
			}else{
				hm.put(num,1);
			}
		}

		for(long num:arr2){

			if(hm.containsKey(num)){
				if(hm.get(num)==1){
					hm.remove(num);
				}else{
					hm.put(num,hm.get(num)-1);
				}
			}else{
				return "No";
			}
		}

		return "Yes";
        
    	}
	public static void main(String [] pdp) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Array Size");
		long arr1[] = new long[Integer.parseInt(br.readLine())];

		System.out.println("Enter The Array Elements");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Enter The Array 2 Size");
		long arr2[] = new long[Integer.parseInt(br.readLine())];

		System.out.println("Enter The Array Elements");
		for(int i=0;i<arr2.length;i++){
			arr2[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Is Subset : "+isSubset(arr1,arr2,arr1.length,arr2.length));

	}
}
