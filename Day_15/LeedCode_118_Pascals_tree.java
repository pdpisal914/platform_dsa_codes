/*
118. Pascal's Triangle
Solved
Easy
Topics
Companies
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 

Constraints:

1 <= numRows <= 30
*/
import java.io.*;
import java.util.*;
class Solution {
    static List<List<Integer>> generate(int numRows) {
	List<List<Integer>> original = new ArrayList<>();
	List<Integer> current = null;

	for(int i=0;i<numRows;i++){
		current = new ArrayList<>();

		for(int j=0;j<=i;j++){

			if(j==0 || j==i){
				current.add(1);
			}else{
				current.add(original.get(i-1).get(j-1) + original.get(i-1).get(j));
			}
		}
		original.add(current);
	}
	return original;
        
    }
    public static void main(String [] pdp) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter The Number of rows");
	    int row = Integer.parseInt(br.readLine());

	    List<List<Integer>> temp = generate(row);

	    for(int i=0;i<temp.size();i++){
		    System.out.println(temp.get(i));
	    }
    }
}
