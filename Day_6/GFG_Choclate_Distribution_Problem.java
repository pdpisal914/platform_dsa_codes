import java.io.*;
import java.util.*;
class Demo{
	public int maximumProduct(int[] arr) {

		if(arr.length<3){
			return -1;
		}
		int max1 = Integer.MIN_VALUE;
		int max2 = max1;
		int max3 = max2;
		boolean flagmax2 = false;
		boolean flagmax3 = false;

		for(int i =0;i<arr.length;i++){
			
			if(max2 == arr[i]){
				flagmax2 = true;
			}
			if(max3 == arr[i]){
				flagmax3 = true;
			}
			if(arr[i]>max1){
				max3 = max2;
				max2 = max1;
				max1 = arr[i];
			}else if(arr[i] > max2){
				max1 = max2;
				max2 = arr[i];
			}else if(arr[i]>max1){
				max1 = arr[i];
			}
		}
		
		if(max2 == Integer.MIN_VALUE){
			if(flagmax3){
				max2 = max3;
				flagmax2 = true;
			}
		}
		if(max1 == Integer.MIN_VALUE){
			if(flagmax2){
			       max1 = max2;
			}
		}		
		
		return max2*max3*max1;
    	}

	static int choclate(int arr[],int m){

		if(arr.length<m){
			return -1;
		}


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
