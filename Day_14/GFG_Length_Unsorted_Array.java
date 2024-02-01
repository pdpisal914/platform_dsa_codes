/*
Length Unsorted Subarray
EasyAccuracy: 27.55%Submissions: 23K+Points: 2
30+ People have Claimed their 90% Refunds. Start Your Journey Today! 

banner
Given an unsorted array Arr of size N. Find the subarray Arr[s...e] such that sorting this subarray makes the whole array sorted.

Example 1:

Input:
N = 11
Arr[] ={10,12,20,30,25,40,32,31,35,50,60}
Output: 3 8
Explanation: Subarray starting from index
3 and ending at index 8 is required
subarray. Initial array: 10 12 20 30 25
40 32 31 35 50 60 Final array: 10 12 20
25 30 31 32 35 40 50 60
(After sorting the bold part)
Example 2:

Input:
N = 9
Arr[] = {0, 1, 15, 25, 6, 7, 30, 40, 50}
Output: 2 5
Explanation: Subarray starting from index
2 and ending at index 5 is required
subarray.
Initial array: 0 1 15 25 6 7 30 40 50
Final array:   0 1 6 7 15 25 30 40 50
(After sorting the bold part)
Your Task:
You don't need to read input or print anything. Your task is to complete the function printUnsorted() which takes the array of integers arr and n as parameters and returns a pair of integers denoting {s, e}. If no such subarray exists, return {0, 0}.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 107
1 ≤ Arr[i] ≤ 108
*/

import java.io.*;
import java.util.*;
class Solve {
    static int[] printUnsorted(int[] arr, int n) {
        // code here
        int start=-1;
        int end = -1;
        
        int temp[] = new int[n];
        
        for(int i =0;i<n;i++){
            temp[i]=arr[i];
        }
        
        Arrays.sort(temp);
        boolean sFlag = false;
        boolean eFlag = false;
        
        for(int i =0;i<n;i++){
            if(arr[i] != temp[i] && sFlag == false){
                start = i;
                sFlag = true;
            }
            if(arr[n-i-1] != temp[n-1-i] && eFlag == false){
                end = n-1-i;
                eFlag = true;
            }
        }
        
        if(start ==-1 && end == -1){
            return new int[]{0,0};
        }
        
        return new int[]{start,end};
    }

    public static void main(String [] pdp) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter The Array Length");
	    int arr[] = new int[Integer.parseInt(br.readLine())];

	    System.out.println("Enter The Array Elements");
	    for(int i=0;i<arr.length;i++){
		    arr[i]=Integer.parseInt(br.readLine());
	    }

	    System.out.println("O/p : "+Arrays.toString(printUnsorted(arr,arr.length)));
    }


}
