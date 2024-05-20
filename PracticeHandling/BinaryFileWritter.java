package PracticeHandling;
import java.io.*;

public class BinaryFileWritter{
    public static void main(String[] args) {

        try{
            //create a fileoutputstream to the desire file
            FileOutputStream fos = new FileOutputStream("output.bin");

            //wrap the fileoutputstream in a bufferedoutputstream
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            //wrap the bufferedoutputstream in a dataoutput stream
            DataOutputStream dos = new DataOutputStream(bos);

            //write various data types to the file
            dos.writeInt(123); //write an integer
            dos.writeDouble(456.4); //write a double
            dos.writeBoolean(false); //write a boolean
            dos.writeUTF("sujan magar"); //write a string in modified UTF-8

            //close the streams
            dos.close();;
            bos.close();
            fos.close();

            System.out.println("data written to output.in sucessfully");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}