/*
283. Move Zeroes
Easy
Topics
Companies
Hint
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 
*/

import java.util.*;
import java.io.*;
class Solution {

    int ind;
    int i=0;
    int j;
    void recurssion(int []arr,int ind){
	    if(ind == -1){
		    return;
	    }
	    int num = arr[ind];
	    recurssion(arr,ind-1);

	    if(num == 0){
		    arr[j]=0;
		    j--;
	    }else{
		    arr[i]=num;
		    i++;
	    }
    }
    void moveZeroes(int[] nums) {
        ind = nums.length-1;
	j=ind;
	recurssion(nums,ind);

    }

    public static void main(String [] pdp) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter The Array Size");
	    int arr[] = new int[Integer.parseInt(br.readLine())];

	    System.out.println("Enter The Array Elements");
	    for(int i=0;i<arr.length;i++){
		    arr[i]=Integer.parseInt(br.readLine());
	    }

	    Solution obj = new Solution();
	    obj.moveZeroes(arr);

	    System.out.println("Output : "+Arrays.toString(arr));
    }

}
