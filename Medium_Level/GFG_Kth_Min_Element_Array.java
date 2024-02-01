import java.util.*;
import java.io.*;
class Solution{
    static int index(int arr[],int min){
	    int curr = Integer.MAX_VALUE;
	    for(int i=0;i<arr.length;i++){
		    if(arr[i]<curr && arr[i]>min){
			    curr = arr[i];
		    }
	    }
	    return curr;
    }


     static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
	    int min = Integer.MIN_VALUE;

	    for(int i=1;i<=k;i++){
		    min = index(arr,min);
	    }
	    
	    if(min!=Integer.MIN_VALUE){
		    return min;
	    }else{
			return -1;
	    }
    } 

    public static void main(String [] pdp) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter The Array Size");
	    int arr[] = new int[Integer.parseInt(br.readLine())];

	    System.out.println("Enter The Elements");
	    for(int i=0;i<arr.length;i++){
		    arr[i]=Integer.parseInt(br.readLine());
	    }

	    System.out.println("Enter The Value of k");
	    int k = Integer.parseInt(br.readLine());

	    System.out.println("Kth small :"+kthSmallest(arr,0,arr.length-1,k));
    }
}

