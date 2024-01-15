package AddEmpDetails.com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;




public class WriteEmpDetails {
	public static void main(String[] args) throws IOException {
		Workbook workbook = new HSSFWorkbook(); //To create Exel
		Sheet sheet1=workbook.createSheet("DetailsOfAnEmp");
		
		HashMap<String, Employee> map = new HashMap<String, Employee>();
		
		Employee e1=new Employee("Vishal", 1, "CTS");
		Employee e2=new Employee("Suhas",2,"Accenture");
		Employee e3=new Employee("Rohan",3,"Kalyera");
		Employee e4=new Employee("Irol",4,"IBM");
		Employee e5=new Employee("Varun",4,"Razorpay");
		map.put("1", e1);
		map.put("2", e2);
		map.put("3", e3);
		Set<String> keyId=map.keySet();
		
		//System.out.println(keyId);//[1, 2, 3]
		for(String key:keyId) {
			int rcount=0;
			int ccount=0;
			Row r=sheet1.createRow(rcount++);
			Employee e=map.get(keyId);//m.getKey();
			for(Employee obj:e) {
			Cell cell=r.createCell(ccount++);
			cell.setCellValue(key);
		}
		}
			
		
		FileOutputStream output=new FileOutputStream(new File("E:\\nihongo\\emp.xls"));
		workbook.write(output);
		output.close();
		
		
		
		
	}
	

}
