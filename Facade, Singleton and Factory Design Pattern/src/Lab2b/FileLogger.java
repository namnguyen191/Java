package Lab2b;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileLogger implements Logger {

    public void log(String dataLine){
        DataOutputStream dos;
        String fileName = "log.txt";
        dataLine = "\n" + dataLine;

        try{
            dos = new DataOutputStream(new FileOutputStream(fileName, true));
            dos.writeBytes(dataLine);
            dos.close();
        } catch (FileNotFoundException ex){

        } catch (IOException ex){

        }
        System.out.println(dataLine);
    }
}
