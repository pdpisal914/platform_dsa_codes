//LEETCODE
//Que 136 : Single Element
//i/p:arr = [4,1,2,1,2];
//o/p=4


import java.util.*;
import java.io.*;
class Solution {
    public int singleNumber(int[] nums) {

        Arrays.sort(nums);
        int i;
        for(i=1;i<nums.length;i=i+2){
            if(nums[i]!=nums[i-1]){
                return nums[i-1];
            }
        }
        return nums[i-1];
        
    }
}
class Demo{
	public static void main(String [] pdp) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Array Length");
		int arr[] = new int[Integer.parseInt(br.readLine())];

		System.out.println("Enter The Array Elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		Solution obj = new Solution();

		System.out.println("Single Number is : "+obj.singleNumber(arr));
	}
}
