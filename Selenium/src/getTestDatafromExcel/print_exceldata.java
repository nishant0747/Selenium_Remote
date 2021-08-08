package getTestDatafromExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class print_exceldata 
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\td.pmdx");
		
		 Sheet mysheet = WorkbookFactory.create(file).getSheet("Sheet1");
		 
//		 Workbook g = WorkbookFactory.create(file);
//		 
//		 Sheet p = g.getSheet("d");
//		 
//		Row l = p.getRow(6);
//		
//		Cell d = l.getCell(5);
//		
	
		 
		 for( int i =0; i<=mysheet.getLastRowNum(); i++)
		 {
			 
			 for(int j=0; j<= mysheet.getRow(i).getLastCellNum()-1; j++)
			 {
				
				 String getTable = mysheet.getRow(i).getCell(j).getStringCellValue();
				 
				 System.out.print(getTable+ " "); 
			 } 
			 
			 System.out.println();
		 }
		
		
		
		
		
	}

}
