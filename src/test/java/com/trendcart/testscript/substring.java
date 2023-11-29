package com.trendcart.testscript;

public class substring {

	public static void main(String[] args)
	{

		String s="r24,5";
		String l = s.substring(1);
		char[] c = l.toCharArray();
		String v=" ";
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='0'&& c[i]<='9')
			{
				v+=c[i];
			}

		}
		System.out.println(v);
	}

}
