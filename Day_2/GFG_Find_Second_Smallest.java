import java.util.*;
import java.io.*;
class Compute 
{
    static long min = Integer.MAX_VALUE;
        static long max = Integer.MIN_VALUE;
        static long sec = Integer.MAX_VALUE;

        void fun(long []arr,int i){

                if(i < 0){
                        return;
                }
                if(min>arr[i]){
                        min = arr[i];
                }
                if(max<arr[i]){
                        max = arr[i];
                }

                fun(arr,i-1);

                if(arr[i] != min && arr[i]<max && arr[i]<sec){
                        sec = arr[i];
                }

        }
        
    public long[] minAnd2ndMin(long arr[], long n)  
    {
	    /*
	    //MYWAY : Recurssion
         fun(arr,arr.length-1);
                if(max == min){
                        return new long[]{-1};
                }else if(sec == Integer.MAX_VALUE){
                        sec = max;
                }
                return new long[]{min,sec};
              */  
       
	Arrays.sort(a);
        long sec = Long.MAX_VALUE;
        long first = Long.MAX_VALUE;
        
        first = a[0];
        sec = first;
        for(int i=0; i<a.length; i++){
            
            if(sec < a[i]){
                sec = a[i];
                break;
            }
        }
        if(a[0] == sec){
            return new long[]{-1};
        }
        return new long[]{a[0],sec};

	  
    }
    
     
}

class Demo{
	
	public static void main(String [] pdp) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Array Size");
		long arr[] = new long[Integer.parseInt(br.readLine())];

		System.out.println("Enter The Elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		Compute obj = new Compute();

		
		System.out.println("Output : "+Arrays.toString(obj.minAnd3ndMin(arr,arr.length)));
		
		

	}

}

