package getTestDatafromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class print1column 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\td.xlsx");
		
		 Sheet mysheet = WorkbookFactory.create(file).getSheet("Sheet1");
		 
		 for(int i=0; i<=mysheet.getLastRowNum(); i++)
		 {
			 String firstcolumn = mysheet.getRow(i).getCell(1).getStringCellValue();
			 
			 System.out.println(firstcolumn); 
			// System.out.println();
		 }
		
	}

}
