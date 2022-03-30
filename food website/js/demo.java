/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class demo
{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		while(n>0){
		    
		    int N=sc.nextInt();
		    String a = sc.nextLine();
		    int c1=0;
		    int c2=0;
		    for(char c : a.toCharArray()){
		        
		        if(c.equals('0')){
		            c1++;
		        }
		        else{
		            c2++;
		        }
		    }
		     System.out.println(a);
		    if(c1==c2){
		       
		    System.out.println(2*(Math.min(c1,c2)));
		    }
		    else{
		        System.out.println((2*(Math.min(c1,c2)))+1);
		    }
		    n--;
		}
		
	}
}
