package Class27;

import Utils.Constants;
//import org.apache.poi.sl.usermodel.Sheet;  //chatAi said wrong sheet import
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E1ExcelFile {
    public static void main(String[] args) throws IOException {
/* this line String path="C:\\Users\\ayesh\\IdeaProjects\\Class25\\Files\\excelJava.xlsx";
dont have to copyPaste path of excelFile cuz already save its path constants and created its class/method to reuse it*/

        FileInputStream fis=new FileInputStream(Constants.EXCEL_FILE_PATH); //added Contants and FileName
        XSSFWorkbook xss= new XSSFWorkbook(fis); //created Class that understands to reads/write excel
        Sheet sheet= xss.getSheet("Sheet1"); //first need to get sheet //add 'Sheet1' to read data

        int captureRowWithData= sheet.getPhysicalNumberOfRows();//from sheet capture all excel where's data
        for (int i = 0; i < captureRowWithData; i++) {
            Row row=sheet.getRow(i); //from sheet get me the row, of index 0

        int noOfActualCellsWithDAta=row.getPhysicalNumberOfCells();//not declaring these outside of loop cuz 'localVar' are preferred and they are always stored inside the block
            for (int j = 0; j < noOfActualCellsWithDAta; j++) {
                //System.out.println(row.getCell(j)); //this print eachRow and eachCell (j) in non-excel format
                System.out.print(row.getCell(j)+" "); //this prints in a singleLine NEED emptySOUT to print in nextLine after each row
            }
            System.out.println();
        }
/*above code only printsToRead data, Not being Stored

Use data to perform different things like DataDrivenTesting, this would need a COMBINATION of dataStructure: ArrayListOfMaps
1) take the first row (index0)  and use it as a header for(Key) and
2) KeysValue (value) would be the actual data from each Row(starting from index1)

* Can't use 2DArray cuz they are fixed in size, meaning must know all noOindexes and cants change its size

 */
    }
}
        /* to get one cell only
        Row row= sheet.getRow(0); //from sheet of sheet1 get me the row, of index 0
        Cell cell=row.getCell(0); //from row index0 get me the CELL index0
        System.out.println(cell);//prints the cell of index0

        //to get haider
        Row rowhaider= sheet.getRow(2);
        Cell cellhaider=rowhaider.getCell(1);
        System.out.println(cellhaider);    */

/* write the below so that my program can read the full excel file
1) first create variable for storing fullRowData
2) write outerLoop to go through each row in excelFile
3) then store those rows in a variable to save data
4) create variable for storing fullCellData
5) write nestedLoop to go through each cell in excelFile
6) print eachRow and eachCell (j) */