import java.util.*;
import java.io.*;
class Demo{
	static int fun(int nums[]){
        // your code here
        Arrays.sort(nums);
        int max = nums[0];
        int preCnt =0;
        int cnt =0;
        int check = nums[0];

        for(int i=0;i<nums.length;i++){
            if(nums[i] == check){
                cnt++;
            }else{
                check = nums[i];
                if(preCnt < cnt){
                        max = nums[i-1];
                    preCnt = cnt;
                }
                cnt=1;
            }
        }
        
        if(preCnt < cnt){
            max = check;

        }
        if(preCnt>nums.length/2){
            return max;
        }else{
            return -1;
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

		System.out.println("Output : "+fun(arr));
	}

}
