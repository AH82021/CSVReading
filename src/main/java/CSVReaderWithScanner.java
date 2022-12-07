import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//reading CSV using Scanner class
public class CSVReaderWithScanner {
    public static void main(String[] args) throws Exception {
        //parsing a csv file into constructor of scanner class
        Scanner scan = new Scanner(new File("src/main/resources/data.csv"));

        scan.useDelimiter(",");
        List<String> columns = new ArrayList<>();
        while (scan.hasNext()){
            columns.add(scan.next());

        }
        for (String column:columns
             ) {
            System.out.print(column);
        }
        scan.close();
    }
}
