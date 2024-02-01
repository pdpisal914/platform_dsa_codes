import java.io.*;
import java.util.*;
class Solution {
	static int binaryS(int []arr,int start,int end,int ele){
		if(start>end){
			return -1;
		}

		int mid = (start+(end-start)/2);
		if(arr[mid]==ele){
			return mid;
		}
		if(ele < arr[mid]){
			return binaryS(arr,start,mid-1,ele);
		}else{
			return binaryS(arr,mid+1,end,ele);
		}

	}

    static int binarySearch(int arr[], int n, int ele) {
		
	    return binaryS(arr,0,n-1,ele);

        
    }
    public static void main(String [] pdp) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter The Array Length");
	    int arr[] = new int[Integer.parseInt(br.readLine())];
		
	    System.out.println("Enter The Array Elements");
	    for(int i=0;i<arr.length;i++){
		    arr[i] = Integer.parseInt(br.readLine());
	    }

	    System.out.println("Enter The Element for Search");
	    int ele = Integer.parseInt(br.readLine());

	    System.out.println("Output : "+binarySearch(arr,arr.length,ele));
    }
}
