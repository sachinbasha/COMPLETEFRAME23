package com.demo.testscripts;

public class twodimensionarry 
{
   public static void main(String[] args)
	{
		String[][]a= {{"gjdghgjd","asfamshg"} ,{"vhqdf","vmdwvv","sachin"}};
		System.out.println(a.length);
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=0;j<a[i].length;j++)
	    	{
	    		System.out.print(a[i][j]+"   ");
	    	}
	    	System.out.println();
	    }
	}
}
