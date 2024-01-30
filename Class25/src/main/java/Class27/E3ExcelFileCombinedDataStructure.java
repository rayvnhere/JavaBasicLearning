package Class27;
import Utils.Constants;
import com.google.common.collect.Maps;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
//1:20 // see lastPart and if that needs explanation then non-commented code or else the video
public class E3ExcelFileCombinedDataStructure {
    public static void main(String[] args) throws IOException {
/*                            BELOW CODE HELPS TO STORE EXCEL DATA (even if I make changes in the excel, it will store it)

Use data to perform different things like DataDrivenTesting, this would need a COMBINATION of dataStructure: ArrayListOfMaps
1) take the first row (index0)  and use it as a header for(Key) and
2) KeysValue (value) would be the actual data from each Row(starting from index1)   */

        FileInputStream fis=new FileInputStream(Constants.EXCEL_FILE_PATH); //added Contants and FileName
        XSSFWorkbook xss= new XSSFWorkbook(fis); //created Class that understands to reads/write excel
        Sheet sheet= xss.getSheet("Sheet1"); //first need to get sheet //add 'Sheet1' to read data

        int captureRowWithData= sheet.getPhysicalNumberOfRows();//from sheet capture all excel where's data

        List<Map<String,String>> wholeExcelData=new ArrayList<>(); //planning to create map for EACHRow so, List is going to contain lots of Maps and maps would be stored in ArrayList, cuz ArrayList can manage and stores the growing maps

        Row headerRow=sheet.getRow(0); //SEPERATE EXTRACTED Index0 is the header, to have Key //FOR LIST 'KEY' COMES FROM HERE
        for (int i = 1; i < captureRowWithData; i++) { //row for "values" starts from index1

            Row row=sheet.getRow(i); //from sheet get me the row, of index 0  //FOR LIST 'VALUES' COMES FROM HERE
            Map<String,String> rowMap= new LinkedHashMap<>(); //for everyRow needs a new map //tis line save and stores all new CreatedMaps

            int noOfActualCellsWithDAta=row.getPhysicalNumberOfCells();//not declaring these outside of loop cuz 'localVar' are preferred and they are always stored inside the block
            for (int j = 0; j < noOfActualCellsWithDAta; j++)    {
//after filling the map for eachRow, NOW we need to put it inside the LIST
                String key= headerRow.getCell(j).toString(); //.getCell(0) returns object of a cellClass so need to convert it into
                String value= row.getCell(j).toString();
//now store LIST info into MAP
                rowMap.put(key,value);
            }
//now store MAP into ArrayLIST variable
            wholeExcelData.add(rowMap);
        }
        System.out.println(wholeExcelData);
    }
}
/*
// To Bring the data from file into the java program
        FileInputStream fis=new FileInputStream(Constants.EXCEL_FILE_PATH);
        //A class that understands how excel works
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
        //There can be many sheets we are getting the sheet1 from excel
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        //getting the number of actual rows that contains the data
        int noOfActualRowsWithData=sheet.getPhysicalNumberOfRows();
        // A List of maps to store all the info from Excel sheet
        List<Map<String,String>> excelData=new ArrayList<>();
        //Getting the row number 0 as we will be using this for all the maps as keys
        Row headerRow=sheet.getRow(0);
        // A loop to go through all the rows
        for (int i = 1; i <noOfActualRowsWithData ; i++) {
            //Getting each row one by one from the map
            Row currentRow=sheet.getRow(i);
            //A new Map for every row
            Map<String,String> rowMap=new LinkedHashMap<>();
            //The Actual no of cells that contains the data in reach row
            int noOfActualCellsWithData=currentRow.getPhysicalNumberOfCells();
            // A loop to go through all the cells
            for (int j = 0; j <noOfActualCellsWithData ; j++) {
                // From Header, we get the keys
                String key=headerRow.getCell(j).toString();
                // From current row we get the values
                String value=currentRow.getCell(j).toString();
                //store these keys and values in the map
                rowMap.put(key,value);
            }
            //Store each map in the list
            excelData.add(rowMap);
        }
        System.out.println(excelData);
   }
 */
