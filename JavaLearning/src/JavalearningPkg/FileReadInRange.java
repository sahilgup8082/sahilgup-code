package JavalearningPkg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadInRange {
	
	public static void rangeRead() throws IOException
	
	{
		File newfile = new File("../JavaLearning/JavaFileAction.txt");   //Connection
		FileReader filre = new FileReader(newfile);     //File read
		BufferedReader rowread = new BufferedReader(filre);   //To read the particular row
		String readtill;     // Read the file upto
		int startrow = 3;
		int endrow = 6;
		int currow = 0;
		while((readtill = rowread.readLine())!=null)
		{
			currow++;
			if(currow>=startrow && currow <= endrow)
				
			{
				
				System.out.println(readtill);
			}		
		}	
	}
         public static void main(String[] args) throws IOException 
         {
			
        FileReadInRange.rangeRead();
        	 
		}
}
