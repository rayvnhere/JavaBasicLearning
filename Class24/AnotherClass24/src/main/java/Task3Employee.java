import java.util.LinkedHashMap;
import java.util.Map;

/*Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
John Smith=$100000
 */
public class Task3Employee {
    public static void main(String[] args) {
        Map<String,Integer> employee= new LinkedHashMap<>();
        employee.put("John Smith",100000);
        employee.put("Sam Boe",100);

// here we have to find minimum and maximum

        String empName="";   // left it empty so that employee name could be stored
        int salary=0;       // we assume 0 is the max and whatever loop says is higher it stores that

        for (var e:employee.entrySet()){
            if(e.getValue()>salary){  //entryValue if greater then salary variable
                empName=e.getKey();  // gets employee name
                salary=e.getValue();  // gets employee salary
            }
        }
        System.out.println(empName+"=$"+salary);

    }
}
