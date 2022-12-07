import javax.imageio.IIOException;
import java.io.*;
//reading CSV using String split() method
public class CSVReader {
    public static final String delimiter =",";

    public static void read(String csvFile){


        try {
            File file = new File(csvFile);
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line ="";
            String[] columns ;
            while ((line=br.readLine())!=null){
                columns = line.split(delimiter);
                for(String column : columns){
                    System.out.print(column);
                }
                System.out.println();
            }
            br.close();

        } catch (IIOException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
     String csvFile = "src/main/resources/data.csv";
     CSVReader.read(csvFile);
    }
}
