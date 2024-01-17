import java.util.*;
import java.io.*;
class Demo{
	static int fun(int arr[],int sum){
		HashMap<Integer,Integer> hm = new HashMap<>();
		int cnt = 0;
		for(int i=0;i<arr.length;i++){

			if(hm.containsKey(sum-arr[i])){
				cnt = cnt+hm.get(sum-arr[i]);
			}
			if(hm.containsKey(arr[i])){
				hm.put(arr[i],hm.get(arr[i])+1);
			}else{
				hm.put(arr[i],1);
			}
		}
		if(cnt!=0){
			return cnt;
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
		System.out.println("Enter The Sum");
		int sum = Integer.parseInt(br.readLine());

		System.out.println("Output : "+fun(arr,sum));
	}

}
