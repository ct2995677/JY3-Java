package com.lil.chet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	
	public static void main(String[] args) {
		File file = new File("C:\\neuedu.txt");
		FileOutputStream os = null;
		if(!file.exists()) {
			try {
				file.createNewFile();
				os = new FileOutputStream(file);
				String str = "today is Monday";
				os.write(str.getBytes());
				System.out.println("Ð´³ö³É¹¦");
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				if(null !=os) {
					try {
						os.close();
					}catch(IOException e) { 
						e.printStackTrace();
					}
				}
			}
		}
	}
	
}
