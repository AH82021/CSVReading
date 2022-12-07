import com.opencsv.CSVReader;

import java.io.FileReader;

public class CSVReaderWithOpenCSV {
    public static void main(String[] args) {
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader("src/main/resources/data.csv"));
            String[] nextLine;
            while ((nextLine =reader.readNext())!=null){
                for (String line:nextLine
                     ) {
                    System.out.print(line);
                }
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
