package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

public class ExcelUtility {

	// reference for private fields where excel objects are stored
	private static HSSFWorkbook workbook;
	private static HSSFSheet sheet;
	private static HSSFCell cell;
	private static DataFormatter f;
	// path to excel file
	public static final String pathToExcelFile = "C:\\Users\\Milivoj\\Desktop\\Baza za projekat\\Data.xls";

	// this method reads data from specific excel worksheet
	public static void setExcelFile(String pathToExcelFile, int index) throws IOException {

		FileInputStream fis = new FileInputStream(pathToExcelFile);

		workbook = new HSSFWorkbook(fis);

		sheet = workbook.getSheetAt(index);
		f= new DataFormatter();
	}

	// method returns information from specific cell excel worksheet
	public static String getCellData(int row, int col) {
		cell = sheet.getRow(row).getCell(col);
		String cellData = f.formatCellValue(cell);
		return cellData;
	}
	

	// method returns sheet
	public static HSSFSheet getSheet() {
		return sheet;
	}	

}
