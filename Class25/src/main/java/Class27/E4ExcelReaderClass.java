package Class27;

import Utils.Constants;
import Utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static Utils.ExcelReader.read;

public class E4ExcelReaderClass {
    public static void main(String[] args) throws IOException {

        List<Map<String,String>> data= read(Constants.EXCEL_FILE_PATH,"Sheet1");
        System.out.println(data.get(0)); //prints complete row1 of excelFile // .get()  gets me Complete Map 1
        System.out.println(data.get(3).get("FirstName")); //to get Individual cell's VALUE, then have to pass 'key' in the .get()

        //its a list so convert to a 'set' or use lambda cuz its a list
        /*1t Way
        data.forEach(x-> x.forEach((k,v)->{
            System.out.println(k+" "+v);     */

        //2nd WAY
        //data.forEach(x-> System.out.println(x));

        //3rd Way(known as method reference) (even simpler then lambda
        data.forEach(System.out::println);


        }

    }


/* Q: in which form the data is being returned from the read method?
ANS: the data is being returned in the form of list> and the list contains map> and the
keys are String and values are also String


LIST is an index bases dataStructure



 */
