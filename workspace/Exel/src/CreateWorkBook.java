import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class CreateWorkBook {
   public static void main(String[] args)throws Exception {
      //Create Blank workbook
		Workbook workbook = new HSSFWorkbook(); //To create Exel
		Sheet sheet1=workbook.createSheet();//To create Sheet
		Sheet sheet2=workbook.createSheet("Vishal L");
		Row row=sheet1.createRow(0);
		Cell cell=row.createCell(5);
	//	Cell cells=sheet1.createRow(0).createCell(5); In one Line
		cell.setCellValue("God Bless Lalith,Sangeetha,Pooja,Akash,Vishal");//A=0,B=1,C=2,D=3,E=4,F=5

      //Create file system using specific name
      FileOutputStream out = new FileOutputStream(new File("E:\\nihongo\\createworkbook.xls"));

      //write operation workbook using file out object 
      workbook.write(out);
      out.close();
      System.out.println("createworkbook.xlsx written successfully");
   }
}