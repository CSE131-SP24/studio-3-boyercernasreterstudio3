package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Pick a number above 0:");
		int n = in.nextInt();
		boolean[] num= new boolean[n];
		num[1]=true;
		num[0]=true;
	    for (int j=2; j<n; j++)
	    {
	    	for (int i=j+j;i<n;i+=j)
	 	   {
	 		   num [i]= true;
	 	   }
	    }
	    for (int i=0; i<n; i++) 
	    {
	    	if (num[i]==!true)
	    	{
	    		System.out.println(i);
	    	}
	    }
	   	
	    
	    /*for (int i=0;i<num.length;i++)
	    {
	    	System.out.println(num[i] + " ");
	    }**/

	}

}
