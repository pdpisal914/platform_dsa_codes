/*
349. Intersection of Two Arrays
Solved
Easy
Topics
Companies
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
*/
import java.io.*;
import java.util.*;
class Solution {
    static int[] intersection(int[] arr1, int[] arr2) {
     HashSet<Integer> hs = new HashSet<>();

     for(int num:arr1 ){
         hs.add(num);
     }
        int n =0;
     for(int num:arr2){
         if(hs.contains(num)){
             arr1[n]=num;
             n++;
             hs.remove(num);
         }
     }
     int newArr[] = new int[n];
     for(int i=0;i<n;i++){
         newArr[i] = arr1[i];
     }
     return newArr;
    }

    public static void main(String [] pdp) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter The Array 1 Size");
	    int arr1[] = new int[Integer.parseInt(br.readLine())];

	    System.out.println("Enter The Array 1 Elements");
	    for(int i=0;i<arr1.length;i++){
		    arr1[i]=Integer.parseInt(br.readLine());
	    }

	    System.out.println("Enter The Array 2 Size");
	    int arr2[] = new int[Integer.parseInt(br.readLine())];

	    System.out.println("Enter The Array 2 Elements");
	    for(int i=0;i<arr2.length;i++){
		    arr2[i]=Integer.parseInt(br.readLine());
	    }

	    System.out.println("Intersection : "+Arrays.toString(intersection(arr1,arr2)));
    }
}
