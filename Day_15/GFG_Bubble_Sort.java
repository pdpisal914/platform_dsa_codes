/*
Bubble Sort
EasyAccuracy: 59.33%Submissions: 152K+Points: 2
30+ People have Claimed their 90% Refunds. Start Your Journey Today! 

banner
Given an Integer N and a list arr. Sort the array using bubble sort algorithm.
Example 1:

Input: 
N = 5
arr[] = {4, 1, 3, 9, 7}
Output: 
1 3 4 7 9
Example 2:

Input:
N = 10 
arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
Output: 
1 2 3 4 5 6 7 8 9 10

Your Task: 
You don't have to read input or print anything. Your task is to complete the function bubblesort() which takes the array and it's size as input and sorts the array using bubble sort algorithm.

Expected Time Complexity: O(N^2).
Expected Auxiliary Space: O(1).

  */
import java.util.*;
import java.io.*;
class Solution
{
    static void bubbleSort(int arr[], int n)
    {
        //code here
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }


    }

    piublic static void main(String [] pdp) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter The Length");
	    int arr[] = new int[Integer.parseInt(br.readLine())];

	    System.out.println("Enter The Array elements");
	    for(int i=0;i<arr.length;i++){
		    arr[i]=Integer.parseInt(br.readLine());
	    }
	    bubbleSort(arr,arr.length);

	    System.out.println(Arrays.toString(arr));
    }
}
