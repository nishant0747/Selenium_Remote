package getTestDatafromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllDataUsingCellType 
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\td.pmdx");
	
		Sheet mySheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		for(int i=0; i<=mySheet.getLastRowNum(); i++)
		{
			for(int j=0; j<=mySheet.getRow(i).getLastCellNum()-1; j++)
			{
				
				CellType type = mySheet.getRow(i).getCell(j).getCellType();
				
				if(type==CellType.STRING)
				{
					System.out.print(mySheet.getRow(i).getCell(j).getStringCellValue()+"  ");
				}
				
				else if(type==CellType.NUMERIC)
				{
					System.out.print(mySheet.getRow(i).getCell(j).getNumericCellValue()+"  ");
	
				}
				
				else if(type==CellType.BOOLEAN)
				{
					System.out.print(mySheet.getRow(i).getCell(j).getBooleanCellValue()+"  ");
	
				}
			
			}
			
			System.out.println();
			
		}
		
		
		
	}

}
