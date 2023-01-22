//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
        
        int temp = n;
        int sum = 0;
        String N = Integer.toString(n);
        int l = N.length();
        while(temp > 0){
            
            int r = temp % 10;
            sum += Math.pow(r,l);
            temp = temp/10;
        }
        
        if(sum == n){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}