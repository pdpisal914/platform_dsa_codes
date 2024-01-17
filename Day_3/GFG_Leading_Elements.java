import java.util.*;
import java.io.*;
class Demo{
	 static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        int prevMax = arr[n-1];
        int ind = n-2;
	int flag =1;
	int cnt = 1;
        for(int i=arr.length-2;i>=0;i--){
            
            if(arr[i]>prevMax){
                prevMax = arr[i];
		arr[ind]=arr[i];
                ind--;
		cnt++;
		flag = 2;
            }
            
        }
	
	ArrayList<Integer> al = new ArrayList<>();

	ind = n-cnt;
	for(int i = ind;i<n;i++){
        	al.add(arr[i]);
       	}
  	return al;
    }
	
 static ArrayList<Integer> leaders2(int arr[], int n){
        // Your code here
        int prevMax = Integer.MIN_VALUE;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){

            if(arr[i]>prevMax){
                prevMax = arr[i];
                al.add(arr[i]);
              }

        }
	Collections.reverse(al);
        
        return al;
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

		System.out.println("Output : "+leaders(arr,arr.length));
		System.out.println("Output way 2 : "+leaders2(arr,arr.length));
	}

}
