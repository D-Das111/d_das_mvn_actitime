package actitime.genericLib;

import java.util.*;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.*;

public class DataUtility {

	public String getDataFromProperties(String key) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Qsp\\Selenium\\Actitimeapp\\src\\test\\resources\\TestData\\actitime.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		return pobj.getProperty(key);
	}

	public String getDataFromExcel(String sheetName, int rowNum, int cellNum)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("D:\\Qsp\\Selenium\\Actitimeapp\\src\\test\\resources\\TestData\\actitime.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetName);
		DataFormatter format = new DataFormatter();
		String value = format.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
		return value;
	}
}
