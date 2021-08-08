package getTestDatafromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getNumericDataasString
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\td.pmdx");
		
		 Sheet mysheet = WorkbookFactory.create(file).getSheet("Sheet1");
		 
		String NumDataAsString = mysheet.getRow(3).getCell(0).getStringCellValue();
		 
		//  double NumDataAsString = mysheet.getRow(3).getCell(0).getNumericCellValue();
		 
		 System.out.println(NumDataAsString);
		 
		
	}

}
