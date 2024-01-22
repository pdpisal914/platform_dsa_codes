import java.io.*;
import java.util.*;
class Demo{
	 int findMaxConsecutiveOnes(int[] arr) {
        
                int cnt =0;
                int preCnt =0;

                for(int i=0;i<arr.length;i++){

                        if(arr[i] == 1){
                                cnt++;
                        }else{
                                if(preCnt < cnt){
                                        preCnt = cnt;
                                }
                                cnt =0;

                        }
                }

                if(preCnt < cnt){
                        preCnt = cnt;
                }

                return preCnt;

    }
    public static void main(String [] pdp) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter The Array Size");
	    int arr[] = new int[Integer.parseInt(br.readLine())];
	    System.out.println("Enter The Array Elements");
	    for(int i=0;i<arr.length;i++){
		    arr[i]=Integer.parseInt(br.readLine());
	    }

	    System.out.println(Arrays.toString(arr));
	    System.out.println("Output : "+new Demo().findMaxConsecutiveOnes(arr));
    }
}
