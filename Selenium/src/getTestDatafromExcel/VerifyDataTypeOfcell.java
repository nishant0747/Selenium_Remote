package getTestDatafromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VerifyDataTypeOfcell
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\td.pmdx");
		
		Sheet MySheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		CellType cell_type = MySheet.getRow(0).getCell(3).getCellType();
		
		System.out.println(cell_type);
			
	}

}
