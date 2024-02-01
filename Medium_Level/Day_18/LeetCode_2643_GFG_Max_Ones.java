import java.io.*;
import java.util.*;
class Solution {
    static int[] rowAndMaximumOnes(int[][] arr) {

	    int row = 0;
	    int cnt =0;

	    for(int i=0;i<arr.length;i++){
		    int c =0;

		    for(int j=0;j<arr[i].length;j++){
			    if(arr[i][j]==1){
				    c++;
			    }
		    }
		    if(cnt<c){
			    cnt = c;
			    row = i;
		    }
	    }

	    return new int[]{row,cnt};
        
    }
    public static void main(String [] pdp) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter The Number Of Rows");
	    int arr[][] = new int[Integer.parseInt(br.readLine())][];

	    for(int i =0;i<arr.length;i++){
		    System.out.println("Enter The Size of Column");
		    arr[i]=new int[Integer.parseInt(br.readLine())];

		    for(int j=0;j<arr[i].length;j++){
			    arr[i][j]=Integer.parseInt(br.readLine());
		    }

	    }

	    System.out.println("Output : "+Arrays.toString(rowAndMaximumOnes(arr)));
    }
}
