package Utilites;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExcelRead {

    public static String ReadXlData(String sheetName, int r, int c) {

        File F = new File(FilePaths.XlPath);
        FileInputStream fi;
         String value ="";
        {
            try {
                fi = new FileInputStream(F);
                Workbook w = new XSSFWorkbook(fi);
                 Sheet s = w.getSheet(sheetName);
                Row row = s.getRow(r);
                Cell cell = row.getCell(c);
                int cellType = cell.getCellType();
                //cell is String
                if (cellType==1){
                   value = cell.getStringCellValue();
                   //cell is data
                }else if(DateUtil.isCellDateFormatted(cell)) {
                    Date d = cell.getDateCellValue();
                    SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyy");
                    value = sim.format(d);
                }else{
                    double d = cell.getNumericCellValue();
                    //type casting
                    long l = (long) d;
                    value = String.valueOf(l);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();

            } catch (IOException e) {

                e.printStackTrace();
            }
        }
        return value;
    }
    public static void main(String[] args) {
        //ReadXlData("CRM",1,1);
        System.out.println( ReadXlData("CRM",1,1));
    }

}
