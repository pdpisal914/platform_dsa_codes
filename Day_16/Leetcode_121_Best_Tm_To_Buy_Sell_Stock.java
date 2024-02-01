/*
121. Best Time to Buy and Sell Stock
Easy
Topics
Companies
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 

Constraints:

1 <= prices.length <= 105
0 <= prices[i] <= 104
*/
import java.util.*;
import java.io.*;
class Solution {
    static int maxProfit(int[] arr) {
	    int min = Integer.MAX_VALUE;
	    int minInd = -1;
	    int max = Integer.MIN_VALUE;
	    int maxInd =-1;
	    int profit = Integer.MIN_VALUE;
		
	    for(int i=0;i<arr.length;i++){
		    if(min>=arr[i]){
			    min = arr[i];
			    minInd = i;
			    max = Integer.MIN_VALUE;
		    }else if(max<=arr[i]){
			   max = arr[i];
			  maxInd = i;
		    }
		   if(maxInd > minInd && profit<max-min){
			   	profit = max-min;
			   }

		   }
	    if(profit != Integer.MIN_VALUE){
		    return profit;
	    }else{
		    return 0;
	    }
/*
	    for(int i =0;i<arr.length;i++){
		    if(min>arr[i]){
			    min = arr[i];
			    minInd = i;
		    }
		*/

        
    }
    public static void main(String [] pdp) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter The Array Length");
	    int arr[] = new int[Integer.parseInt(br.readLine())];

	    System.out.println("Enter The Array Elements");
	    for(int i=0;i<arr.length;i++){
		    arr[i] = Integer.parseInt(br.readLine());
	    }

	    System.out.println("Profit : "+maxProfit(arr));
    }
}
