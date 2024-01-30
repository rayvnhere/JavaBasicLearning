package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E4ExcelFile {
    public static void main(String[] args) throws IOException {
        /* this is how we can read data from excelFile
        copy excelFile > paste it under 'Files' folder
        and perform the following 3 steps;
        1) location: copy absolute path \
        2) navigate: navigate to that location using fisClass
        3) XSSFWordbook: special classs that understand how excelFile works
           (get it by mavenRepository > search > poi-ooxml (based on opc & last Version)
                                                 paste it under dependencies   */

//1)    Know location
        String path="C:\\Users\\ayesh\\IdeaProjects\\Class25\\Files\\excelJava.xlsx";
//2)    Navigate
        FileInputStream fis= new FileInputStream(path);
//3)    XSSWorkbook
        XSSFWorkbook excel= new XSSFWorkbook(fis);
//4)    to focus on sheet 1 only
        Sheet sheet= excel.getSheet("Sheet1");

//            from sheet access row
        Row row1=sheet.getRow(1);
//            then from row access cell
        Cell cell1=row1.getCell(1);
        System.out.println(cell1);
        //prints Values of Row 1 and Column 1







    }
}
//* in java column are called 'Cell'
//* excel index also starts from zero
//* XSSFWorkbook is a class
