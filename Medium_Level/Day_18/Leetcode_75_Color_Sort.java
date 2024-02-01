import java.util.*;
import java.io.*;
class Solution {
    static void sortColors(int[] nums) {
	    int one = 0;
	    int two=0;

	    for(int i=0;i<nums.length;i++){
		    if(nums[i]==1){
			    one++;
		    }
		    if(nums[i]==2){
			    two++;
		    }
	    }

	    for(int i=nums.length-1;i>=0;i--){

		    if(two!=0){
			    nums[i]=2;
			    two--;
		    }else if(one!=0){
			    nums[i]=1;
			    one--;
		    }else{
			    nums[i]=0;
		    }
	    }

	    System.out.println("o/p : "+Arrays.toString(nums));
    }
        
    public static void main(String [] pdp) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter The Array Length");
	    int arr[] = new int[Integer.parseInt(br.readLine())];

	    System.out.println("Enter The Elements");
	    for(int i=0;i<arr.length;i++){
		    arr[i]=Integer.parseInt(br.readLine());
	    }
	    sortColors(arr);
    }
}
