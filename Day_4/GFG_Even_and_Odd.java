import java.util.*;
import java.io.*;
class Demo{

	 void evenAndOdd(int arr[],int n){
		
		int even = 0;
		int odd = 1;

		       
	        while(even<n){
        	    
        	    if(arr[even]%2 == 0){
        	        even = even + 2;
       		     }else if(arr[odd]%2 != 0){
        	        odd = odd+2;
        	    }else{
        	        int temp = arr[odd];
        	        arr[odd] = arr[even];
        	        arr[even]=temp;
        	        even = even +2;
        	        odd = odd +2;
        	    }
        	}
                

	}
	public static void main(String [] pdp) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Array Length");
		int arr[] = new int[Integer.parseInt(br.readLine())];

		System.out.println("Enter The elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		//System.out.println("Enter The Sum");
		//int sum = Integer.parseInt(br.readLine());
		new Demo().evenAndOdd(arr,arr.length);
		System.out.println("Output : "+Arrays.toString(arr));
	}
}
