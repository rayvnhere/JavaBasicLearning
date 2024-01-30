package org.example;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
public class E8MapsInArrayList {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\ayesh\\IdeaProjects\\Class25\\Files\\excelJava.xlsx";
        var fis= new FileInputStream(path);
        var excel= new XSSFWorkbook(fis);
        var sheet= excel.getSheet("Sheet 1");

        List<Map<String,String>> excelData= new ArrayList<>();
/* 'ArrayList/list'         to arrange map in an arranged way using arraylist
    <MapString,String>>     for each row, create its OWN NEW map i.e. header that is equal to key to hold value's
** loop wont start from index 0, cuz on index0, made it header(that hold keys) and key's value is on index 1 for each map
header is going to stay same(as its a key) and its row of value's will iterate */

        int noOfRow=sheet.getPhysicalNumberOfRows();

        Row header=sheet.getRow(0);                  //extracted row0 to use for KEY and named it header

        for (int i=0; i<noOfRow; i++){                      //outerLoop// goes through allRows
            Row row=sheet.getRow(i);                       // row var stores each iteration of (i) when it gets each row
                                                           //and stores row starting from index 1 (values)

            Map<String,String> rowData=new LinkedHashMap<>();// creating NEW  map EVERY time I get new row from outerLoop
            int noOfCells=row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfCells; j++) {// nestedLoop //goes through allColumns

 //to fill the map we need two things, k(is inside header) and v
                String key= header.getCell(j).toString();//extract the key from header
                //says; from 'header(key) index0' 'getCell(values) index1' and store it in key

                String value=row.getCell(j).toString();//for values
                rowData.put(key,value);//rowData is a map and storing/puting key and value inside it
            }
            excelData.add(rowData);  //excelData is ArrayList //inserting EACH TiME a NEW MAP from above inside the arrayList
        }
            System.out.println(excelData);
    }
}
//getCell(j).toString()    meaning converting the cells to strings, cuz when we say getCell data isnt returned in the
//form of string, cuz returns the object of cell class so by using toString it gets converted to string, so that we can
//store it in our map


//* 4:30
