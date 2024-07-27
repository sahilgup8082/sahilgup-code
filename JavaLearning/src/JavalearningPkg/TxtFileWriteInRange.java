package JavalearningPkg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TxtFileWriteInRange {
	
	public static void readWriteData() throws IOException
	
	{
		
		 File read = new File("../JavaLearning/JavaFileAction.txt");
		 File write = new File("../avaLearning/JavaFileActionCreateFile.txt");
		 FileReader filre = new FileReader(read);
		 BufferedReader rowread = new BufferedReader(filre);
		 int strtrow = 2;
		 int endrow = 5;
		 int crntrow = 0;
		 
		 FileWriter fw = new FileWriter(write);
		 BufferedWriter bw = new BufferedWriter(fw);
		 String readtill;
		 
		 while((readtill = rowread.readLine())!=null)
		 {
			 
			 crntrow++;
			 if(crntrow>=strtrow && crntrow<=endrow)
			 {
				 bw.write(readtill);
				 bw.newLine();
				 
				 
			 }
		 }
		 
		 bw.close();
		 System.out.println("Data written");	 	 
	}
	public static void main(String[] args) throws IOException {
		
		TxtFileWriteInRange.readWriteData();
		
	}

}
