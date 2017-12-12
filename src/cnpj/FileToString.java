package cnpj;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileToString{

    public static void main(String[] args) throws FileNotFoundException{    
   File file = new File("cartaocnpj.json");
    StringBuilder fileContents = new StringBuilder((int)file.length());
    Scanner scanner = new Scanner(file);
    String lineSeparator = System.getProperty("line.separator");

    try {
        while(scanner.hasNextLine()) {
            fileContents.append(scanner.nextLine() + lineSeparator);
        }
        System.out.println(fileContents.toString());
    } finally {
        scanner.close();
    }
}
    
}
