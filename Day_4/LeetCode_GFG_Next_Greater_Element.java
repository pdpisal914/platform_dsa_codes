import java.util.*;
import java.io.*;
class Demo{
	static int[] nextGreater(int arr1[],int arr2[]){
	       int result[] = new int[arr1.length];
		HashMap<Integer,Integer> hm = new HashMap<>();
		int j =0;
		int index = 0;
		for(int i=0;j<arr1.length;){
			int curr = arr1[j];
			
			if(curr == arr2[i]){
				if(i == arr2.length-1 || curr>arr2[i+1]){
				       result[j]=-1;
				}else/* if(curr<arr2[i+1]){
			 		result[j]=arr2[i+1];
				}else*/{
					result[j]=arr2[i+1];
				}
				j++;
				
			}
			index++;
			i++;
			if(i == arr2.length){
				i=0;
			}
		}
		System.out.println(index);

		return result;

	}	       
	
	static int[] nextGreaterEle(int arr1[],int arr2[]){
	
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<arr2.length;i++){
			hm.put(arr2[i],i);
		}
		for(int i=0;i<arr1.length;i++){
				int ind = hm.get(arr1[i]);	
				int flag =0;
				while(ind < arr2.length){
					if(arr2[ind] > arr1[i]){
						arr1[i]=arr2[ind];
						flag =1;
						break;
					}
					ind++;
				}

				if(flag == 0){
					arr1[i] = -1;
				
				}
		}
		return arr1;
	}
	public static void main(String [] pdp) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Array Length");
		int arr[] = new int[Integer.parseInt(br.readLine())];

		System.out.println("Enter The elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter The Array 2 Length");
		int arr1[] = new int[Integer.parseInt(br.readLine())];

		System.out.println("Enter The elements");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}
		//System.out.println("Enter The Sum");
		//int sum = Integer.parseInt(br.readLine());

		System.out.println("Output : "+Arrays.toString(nextGreaterEle(arr,arr1)));
	}
}
