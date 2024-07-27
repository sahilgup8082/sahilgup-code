package JavalearningPkg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TxtFileReadBychar {
	
	public void fileRowRead() throws IOException
	{
		File newfile = new File("../JavaLearning/JavaFileAction.txt");
		FileReader filre = new FileReader(newfile);
		int rowno = 3;
		BufferedReader rowread = new BufferedReader(filre);
		String readtill;
		for(int i=1; i<5; i=i++)
		
		{		
			readtill= rowread.readLine();
			if(i==rowno)
		{
					
				System.out.println(readtill);	
	}
	}
	}
        public static void main(String[] args) throws IOException 
        
        {
	TxtFileReadBychar newfile = new TxtFileReadBychar();
	newfile.fileRowRead();
}
}

