package com.trendcart.testscript;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class writedatabacktoproperty {

	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		p.setProperty("nanfa", "1999");
		p.setProperty("nfnq", "532125");
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\practicedata.property");
		p.store(fos,"credentials");
	}

}
