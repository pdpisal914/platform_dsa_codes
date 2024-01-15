//GFG
//Que :Key Pair
/*
 Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.

Example 1:

Input:
N = 6, X = 16
Arr[] = {1, 4, 45, 6, 10, 8}
Output: Yes
Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
 */


 import java.util.*;
import java.io.*;
class Solution {
    boolean keyPair(int arr[], int n, int x) {
        // code here
                int low =0;
                int high = n-1;

                Arrays.sort(arr);

                while(low<high){
                        int sum = arr[high]+arr[low];

                        if(sum == x){
                                return true;
                        }else if(sum>x){
                                high--;
                        }else{
                                low++;
                        }
                }
                return false;
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
		System.out.println("Enter The Target Sum Value : ");
		int target = Integer.parseInt(br.readLine());

		boolean ret = obj.keyPair(arr,arr.length,target);

		if(ret){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
}
