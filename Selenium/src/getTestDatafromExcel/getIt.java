package getTestDatafromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getIt 
{
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\Test data.pmdx");
		
//		String getStringValue = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//
//		
//	    System.out.println(getStringValue);
//		
//		 double getNumericValue = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
//		
//		System.out.println(getNumericValue);
//		 
		 
		
		boolean get_boolean = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getBooleanCellValue();
	
	    System.out.println(get_boolean);
	
	
	
	}

}
