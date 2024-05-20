package PracticeHandling;
import java.io.*;

public class BInaryFileReader {
    public static void main(String[] args) {

        try{

            //create a fileinputstream to the desired file
            FileInputStream fis = new FileInputStream("output.bin");

            //wrap the fileinputstream in a bufferinputstream
            BufferedInputStream bis = new BufferedInputStream(fis);

            //wrap the bufferedinputstream in a datainputstream
            DataInputStream dis = new DataInputStream(bis);

            //read various data types from the file
            int intValue = dis.readInt(); //read an integer
            double doubleValue = dis.readDouble(); //read a double
            boolean booleanValue = dis.readBoolean(); //read a boolean
            String stringValue = dis.readUTF(); //read a string in modified UTF-8

            //print the read values
            System.out.println("integer:" + intValue);
            System.out.println("double:" + doubleValue);
            System.out.println("boolean:" + booleanValue);
            System.out.println("String:" + stringValue);
            
            
            //close the streams
            dis.close();
            bis.close();
            fis.close();
        }

        catch(IOException e){
            e.printStackTrace();


        }
        
    }
    
}
