import java.io.*;
import java.util.*;
class Demo{
	 long findMinDiff (ArrayList<Integer> arr, int n, int m)
	    {
	        Collections.sort(arr);
	        int min = Integer.MAX_VALUE;
	        for(int i = n-1;i>=m-1;i--){
	            
	            if(arr.get(i)-arr.get(i+1-m) < min){
	                min = arr.get(i)-arr.get(i+1-m);
	            }
	            
	        }
	        return min;
	    }	

	public static void main(String [] pdp) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Array Length");
		int arr[] = new int[Integer.parseInt(br.readLine())];

		System.out.println("Enter The Array Elements");
		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Maximum Pro : "+productOf3(arr));

	}
}
