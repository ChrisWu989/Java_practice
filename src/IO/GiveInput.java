package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class GiveInput {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);

        System.out.println("Enter some test:");
        try {
            int text = isr.read();
            while(isr.ready()) {
                System.out.println((char) text);
                text = isr.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ///
        
        // FileReader fr = new FileReader("IO/test.txt");
        // int text = fr.read();
        // while(fr.ready()){
        //     System.out.println((char) text);
        //     text = fr.read();
        // }

        //PRACTICE WITH BUFERED READER
        // BENEFITS OF BUFFERED take data byte by byte

        // OutputStreamWriter osw = new OutputStreamWriter(System.out);
        // osw.write("Hello World");
        // osw.write(2);
        // osw.write('\n');

        try(FileWriter fileWriter = new FileWriter("testing.txt")){
            fileWriter.write("Hello World");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

