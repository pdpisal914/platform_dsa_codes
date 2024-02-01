/*
Minimum distance between two numbers
EasyAccuracy: 19.75%Submissions: 221K+Points: 2
30+ People have Claimed their 90% Refunds. Start Your Journey Today! 

banner
You are given an array a, of n elements. Find the minimum index based distance between two distinct elements of the array, x and y. Return -1, if either x or y does not exist in the array.

Example 1:

Input:
N = 4
A[] = {1,2,3,2}
x = 1, y = 2
Output: 1
Explanation: x = 1 and y = 2. There are
two distances between x and y, which are
1 and 3 out of which the least is 1.
*/
import java.io.*;
import java.util.*;
class Solution {
    int minDist(int arr[], int n, int x, int y) {
        // code here
        
        int i =0;
        int minDist = Integer.MAX_VALUE;
        int prev=-1;
        
        for(;i<n;i++){
            
            if(arr[i]==x || arr[i]==y){
                prev = i;
                break;
            }
        }
        
        for(;i<n;i++){
            
            if(arr[i] == x || arr[i] == y){
                
                if(arr[i] != arr[prev] && minDist>(i-prev)){
                    minDist = i-prev;
                    prev = i;
                }else{
                    prev = i;
                }
            }
        }
        
        if(minDist != Integer.MAX_VALUE){
            return minDist;
        }else{
            return -1;
        }
        
    }

    public static void main(String [] pdp) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter The Array Size:");
	    int arr[] = new int[Integer.parseInt(br.readLine())];

	    System.out.println("Enter The Elements");
	    for(int i=0;i<arr.length;i++){
		    arr[i]=Integer.parseInt(br.readLine());
	    }

	   System.out.println("Enter x:");
	   int x = Integer.parseInt(br.readLine());

	   System.out.println("Enter y:");
	   int y = Integer.parseInt(br.readLine());
	    System.out.println("O/p : "+Solution().minDist(arr,arr.length,x,y));
    }
}
