package getTestDatafromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getboolean_data 
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		
		FileInputStream fl = new FileInputStream("C:\\Users\\HP\\Desktop\\Test data.pmdx");
		
		
		Workbook created = WorkbookFactory.create(fl);
		
		Sheet got = created.getSheet("Sheet2");
		
		
		Row row = got.getRow(2);
		
		
		Cell cell = row.getCell(3);
		
		boolean get_boolean = cell.getBooleanCellValue();
		
		System.out.println(get_boolean );
		
		
		
		
		
	}

}
