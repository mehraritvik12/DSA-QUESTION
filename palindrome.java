package Leap_Code;
import java.util.Scanner;
public class palindrome {
//

	 public static void main(String[] args) {
			
   	 Scanner s = new Scanner(System.in);
   	 int n = s.nextInt();
    	int rev = 0;
		int temp = n;
		while(n>0) 
		{
	    int lastdigit = n % 10;
		n= n /10; 
		rev = (rev *10) + lastdigit;
		
		}
		
		System.out.println(rev);
		
		
		   if (temp==rev) 
       	{
       	
       	System.out.println("Number is Palindrome");
       	
       }
       else
       {
       	System.out.println("Number is not Palindrome");
       }
       
		}
		
}
		
		   
		
     
       
        
        
        
        
    

        
        
