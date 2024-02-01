/*
Transpose of Matrix
EasyAccuracy: 66.5%Submissions: 90K+Points: 2
30+ People have Claimed their 90% Refunds. Start Your Journey Today! 

banner
Write a program to find the transpose of a square matrix of size N*N. Transpose of a matrix is obtained by changing rows to columns and columns to rows.

Example 1:

Input:
N = 4
mat[][] = {{1, 1, 1, 1},
           {2, 2, 2, 2}
           {3, 3, 3, 3}
           {4, 4, 4, 4}}
Output: 
{{1, 2, 3, 4},  
 {1, 2, 3, 4}  
 {1, 2, 3, 4}
 {1, 2, 3, 4}} 
Example 2:

Input:
N = 2
mat[][] = {{1, 2},
           {-9, -2}}
Output:
{{1, -9}, 
 {2, -2}}

Your Task:
You dont need to read input or print anything. Complete the function transpose() which takes matrix[][] and N as input parameter and finds the transpose of the input matrix. You need to do this in-place. That is you need to update the original matrix with the transpose. 

Expected Time Complexity: O(N * N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 103
-109 <= mat[i][j] <= 109
*/

import java.io.*;
import java.util.*;
class Solution
{
    static void transpose(int n,int arr[][])
    {

        for(int i=0;i<n;i++){

            for(int j=i;j<arr[i].length;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;


            }
        }
    }

    public static void main(String [] pdp) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter The Number of rows");
	    int row = Integer.parseInt(br.readLine());
	    int arr[][]=new int[row][row];

	    for(int i=0;i<row;i++){
		    System.out.println("Elements Of Row "+i);
		    for(int j=0;j<row;j++){
			    arr[i][j] = Integer.parseInt(br.readLine());
		    }
	    }

	    transpose(arr.length,arr);
	    for(int i=0;i<row;i++){
		    System.out.println(Arrays.toString(arr[i]));
	    }
    }
}
