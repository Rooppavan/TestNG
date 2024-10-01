package Workingonexcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class reading1 {
  @Test
  public void Excelclass1() throws IOException {
	  
	  FileInputStream  f = new FileInputStream("‪‪D:\\MYFILES\\Mydata\\Testdata.xlsx");
	  XSSFWorkbook j = new XSSFWorkbook(f);
	  XSSFSheet sht = j.getSheet("data");
	  String a = sht.getRow(0).getCell(0).getStringCellValue();
	  System.out.println(a);
  }
}
