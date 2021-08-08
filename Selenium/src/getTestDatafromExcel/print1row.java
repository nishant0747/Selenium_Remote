package getTestDatafromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class print1row 
{
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\td.pmdx");
		
		 Sheet mysheet = WorkbookFactory.create(file).getSheet("Sheet1");
		 
		 for(int i=0; i<=mysheet.getRow(1).getLastCellNum()-1; i++)
		 {
			 String firstrow = mysheet.getRow(1).getCell(i).getStringCellValue();
			 
			 System.out.print(firstrow+" ");
	
		 }
		
		
		
	}

}
