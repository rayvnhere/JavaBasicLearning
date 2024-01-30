package org.example;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E5ExcelFile02 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\ayesh\\IdeaProjects\\Class25\\Files\\excelJava.xlsx";
        var fis= new FileInputStream(path);
        var excel= new XSSFWorkbook(fis);
        var sheet= excel.getSheet("Sheet 1");

        /* to get all excel file in a loop // just printing not storing
        there's a method in java that counts how many rows have the data,
        it is .getPhysicalNumberOfRows(); > it gives ALL non empty row's and cells
        .getPhysicalNumberOfCells();  > gives ALL non empty cells
         so first we need to call those methods and store them, so that we can use them in nestedLoops
         */// first get access rows then from row access column's   = sheet > row > column

        int noOfRows=sheet.getPhysicalNumberOfRows();

        for (int i=0; i<noOfRows; i++){//outerLoop// goes through allRows
            Row row=sheet.getRow(i);// row var stores each iteration of (i) when it gets each row

            int noOfCells=row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfCells; j++) {// nestedLoop //goes through allColumns
                System.out.println(row.getCell(j)+" ");//prints each row with each iteration of (j) i.e. each cell
                //print inside nestedLoop
            }
            System.out.println();//prints a new line after each row
        }
    }
}
//*in excel by default, every number is read in the form of double's
