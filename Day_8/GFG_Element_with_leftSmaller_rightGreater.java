/*
Element with left side smaller and right side greater
EasyAccuracy: 21.83%Submissions: 123K+Points: 2
30+ People have Claimed their 90% Refunds. Start Your Journey Today! 

banner
Given an unsorted array of size N. Find the first element in array such that all of its left elements are smaller and all right elements to it are greater than it.

Note: Left and right side elements can be equal to required element. And extreme elements cannot be required element.

 

Example 1:

Input:
N = 4
A[] = {4, 2, 5, 7}
Output:
5
Explanation:
Elements on left of 5 are smaller than 5
and on right of it are greater than 5.
 

Example 2:

Input:
N = 3
A[] = {11, 9, 12}
Output:
-1
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function findElement() which takes the array A[] and its size N as inputs and returns the required element. If no such element present in array then return -1.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
*/
class Compute {
    public int findElement(int arr[], int n){
        
        int leftMax[] = new int[n];
          int result = -1;
        int rightMin[] = new int[n];
        
        leftMax[0]=arr[0];
        for(int i=1;i<n;i++){
           leftMax[i]=Math.max(leftMax[i-1],arr[i-1]);
        }
        
        rightMin[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--){
           rightMin[i] = Math.min(rightMin[i+1],arr[i+1]);
        }
      
        for(int i =1;i<n-1;i++){
            if(leftMax[i]<=arr[i] && arr[i]<=rightMin[i]){
                result = arr[i];
                break;
                
            }
        }
        
        return result;
        
    }

     public static void main(String [] pdp) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter The Array Size");
                int arr[] = new int[Integer.parseInt(br.readLine())];

                System.out.println("Enter the Elements");
                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }

                int x=Demo.findElement(arr,arr.length);
                System.out.println(x);

        }
}
