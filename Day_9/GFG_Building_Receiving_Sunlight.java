/*
Given are the heights of certain Buildings which lie adjacent to each other. Sunlight starts falling from the left side of the buildings. If there is a building of a certain Height, all the buildings to the right side of it having lesser heights cannot see the sun. The task is to find the total number of such buildings that receive sunlight.

 

Example 1:

Input:
N = 6
H[] = {6, 2, 8, 4, 11, 13}
Output:
4
Explanation:
Only buildings of height 6, 8, 11 and
13 can see the sun, hence output is 4.
 

Example 2:

Input:
N = 5
H[] = {2, 5, 1, 8, 3}
Output:
3
Explanation:
Only buildings of height 2, 5 and 8
can see the sun, hence output is 3.
*/
import java.util.*;
import java.io.*;
class Solution{
	static int countBuildings(int []arr,int n){
		int cnt =1;
		int max = arr[0];

		for(int i=1;i<n;i++){

			if(arr[i]>=max){
				max = arr[i];
				cnt++;
			}
		}
		return cnt;
	}

				
	public static void main(String [] pdp) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Array Length");
		int arr[] = new int[Integer.parseInt(br.readLine())];

		System.out.println("Enter The Array Elements");
		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Count of Buildings : "+countBuildings(arr,arr.length));
	}
}
