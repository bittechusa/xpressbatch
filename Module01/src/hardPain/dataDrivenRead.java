package hardPain;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class dataDrivenRead {

	public static void main(String[] args) throws BiffException, IOException {
	
		File myfile = new File("C:\\Yearly Acc Report\\DataDrivenTest.xls");
		Workbook wb = Workbook.getWorkbook(myfile);
		Sheet mysheet = wb.getSheet("0");
		
	for(int r=1;r<=mysheet.getRows();r++){
			
			Cell mycell = mysheet.getCell(0,2);
			
	}
		

	}

}
