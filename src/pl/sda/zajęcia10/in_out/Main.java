package pl.sda.zajęcia10.in_out;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;


        try {
            inputStream = new FileReader("text.txt");
            System.out.println(new File( ".").getCanonicalFile());
            outputStream = new FileWriter("characteroutput.txt");

            int offset = 5;
            int c;
            while ((c = inputStream.read()) != -1) {
                if(c == 32) {
                    outputStream.write(c);
                    System.out.print(c);
                }
                else {
                    int translate = (((c-65) + offset) %26)+65;
                    System.out.print((char) translate);
                    outputStream.write(translate);
                }
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    static char rek(int c){
        return rek(c+10);
    }
}
