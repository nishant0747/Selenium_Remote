package getTestDatafromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getRowSize 

{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\td.pmdx");
		
		int LastRow = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		
		System.out.println(LastRow+1);
		

		
	}

}
