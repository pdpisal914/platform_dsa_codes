//GFG
//Que :First Repeating Element
/*
Input:
n = 7
arr[] = {1, 5, 3, 4, 3, 5, 6}
Output: 2
Explanation: 
5 is appearing twice and 
its first appearence is at index 2 
which is less than 3 whose first 
occuring index is 3.
*/

import java.util.*;
import java.io.*;
class Solution {
    // Function to return the position of the first repeating element.
    int firstRepeated(int[] arr, int n) {
     
        // Your code here
        HashMap<Integer,Integer> hm = new HashMap<>();
        int preIndex = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if(hm.containsKey(num)){
                int ind = hm.get(num);
                
                if(preIndex > ind){
                    preIndex = ind;
                }
            }
            hm.put(num,i);
        }
        
        if(preIndex == Integer.MAX_VALUE){
            return -1;
        }else{
            return preIndex+1;
        }
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

		int ret = obj.firstRepeated(arr,arr.length);

		if(ret == -1){
			System.out.println("Not Found");
		}else{
			System.out.println("First Repeated Found At : "+ret);
		}

	}
}
