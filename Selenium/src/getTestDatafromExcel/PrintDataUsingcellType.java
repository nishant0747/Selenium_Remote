package getTestDatafromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintDataUsingcellType
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\td.pmdx");
		
		Sheet MySheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		 Cell CellData = MySheet.getRow(0).getCell(1);
		 
		 CellType CT = CellData.getCellType();
		 
		 if(CT==CellType.STRING)
		 {
			 String str = CellData.getStringCellValue();
			 
			 System.out.println(str);
			 
		 }
		 
		 else if(CT==CellType.NUMERIC)
		 {
			double Num = CellData.getNumericCellValue();
			
			System.out.println(Num);
		 }
		 
		 else if(CT==CellType.BOOLEAN)
		 {
			 boolean bool = CellData.getBooleanCellValue();
			 
			 System.out.println(bool);
		 }
		 
		 
		 
		
		
		
	}
	
	

}
