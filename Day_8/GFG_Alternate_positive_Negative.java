/*
Alternate positive and negative numbers
EasyAccuracy: 33.86%Submissions: 156K+Points: 2
30+ People have Claimed their 90% Refunds. Start Your Journey Today! 

banner
Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
Note: Array should start with a positive number and 0 (zero) should be considered a positive element.
 

Example 1:

Input: 
N = 9
Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
Output:
9 -2 4 -1 5 -5 0 -3 2
Explanation : Positive elements : 9,4,5,0,2
Negative elements : -2,-1,-5,-3
As we need to maintain the relative order of
postive elements and negative elements we will pick
each element from the positive and negative and will
store them. If any of the positive and negative numbers
are completed. we will continue with the remaining signed
elements.The output is 9,-2,4,-1,5,-5,0,-3,2.

Example 2:

Input:
N = 10
Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
Output:
5 -5 2 -2 4 -8 7 1 8 0
Explanation : Positive elements : 5,2,4,7,1,8,0
Negative elements : -5,-2,-8
As we need to maintain the relative order of
postive elements and negative elements we will pick
each element from the positive and negative and will
store them. If any of the positive and negative numbers
are completed. we will continue with the remaining signed
elements.The output is 5,-5,2,-2,4,-8,7,1,8,0.
 */


import java.util.*;
import java.io.*;

class Demo{

	static void rearrange(int arr[],int n){ 
		int i =0;
		int pInd = -1;
		for( i=0;i<arr.length;i++){
			if(arr[i]<0){
				pInd++;
				int temp = arr[pInd];
				arr[pInd] = arr[i];
				arr[i]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		int pos = pInd+1;
		int neg =0;

		while(neg<pos && pos<n && arr[neg]<0){

			int temp = arr[neg];
			arr[neg] = arr[pos];
			arr[pos] = temp;
			neg = neg + 2;
			pos = pos + 1;
		}
		System.out.println(Arrays.toString(arr));
	}

	static void rearrange2(int array[],int n){
	int positiveCount = 0;

        for (int num : array) {
            if (num >= 0) {
                positiveCount++;
            }
        }

        int[] positives = new int[positiveCount];
        int[] negatives = new int[n - positiveCount];

        int posIndex = 0, negIndex = 0;

        for (int num : array) {
            if (num >= 0) {
                positives[posIndex++] = num;
            } else {
                negatives[negIndex++] = num;
            }
        }

        int i = 0, j = 0, k = 0;

        while (i < positiveCount && j < n - positiveCount) {
            array[k++] = positives[i++];
            array[k++] = negatives[j++];
        }

        while (i < positiveCount) {
            array[k++] = positives[i++];
        }

        while (j < n - positiveCount) {
            array[k++] = negatives[j++];
        }

	}
	





	public static void main(String [] pdp) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Array Size");
		int arr[] = new int[Integer.parseInt(br.readLine())];

		System.out.println("Enter the Elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		Demo.rearrange2(arr,arr.length);
		System.out.println(Arrays.toString(arr));

	}
}
