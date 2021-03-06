package com.sgtesting.basicscenariosdemo;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AllScenariosRunner {

	public static void main(String[] args) {
		executeTests();
	}
	private static void executeTests()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fin=new FileInputStream("D:\\CurrentWorkSpace\\ExampleMar212022Batch\\Reflection-Automation\\DataFiles\\AllBasicScenario_runner.xlsx");
			wb=new XSSFWorkbook(fin);
			int sc=wb.getNumberOfSheets();
			for(int s=0;s<sc;s++)
			{
				String sname=wb.getSheetName(s);
				System.out.println(sname);
				sh=wb.getSheet(sname);
				int rc=sh.getPhysicalNumberOfRows();
				for(int r=1;r<rc;r++)
				{
					row=sh.getRow(r);
					cell=row.getCell(0);
					String methodname=cell.getStringCellValue();

					cell=row.getCell(1);
					String pkgclassname=cell.getStringCellValue();

					System.out.println(methodname+" ---> "+pkgclassname);

					Class clsObject=Class.forName(pkgclassname);
					Object obj=clsObject.getConstructor().newInstance();

					Method method=obj.getClass().getMethod(methodname);
					method.invoke(obj);		
				}
			}	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				wb.close();
				fin.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
