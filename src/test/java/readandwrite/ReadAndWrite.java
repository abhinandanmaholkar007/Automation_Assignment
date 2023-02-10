package readandwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWrite {
    public static void main(String[] args) throws IOException {
        File file=new File("Sample.txt"); //Represent the file

        if(!file.exists())
        {
            file.createNewFile();  //if file is not present create new file
        }
        //To write something in file we need to create an object of FileOutputStream Class
        FileOutputStream fos=new FileOutputStream(file);
        String writtenText="Hyve is a digital platform and GSMU will be organized in July 2023";
        fos.write(writtenText.getBytes());
        fos.flush(); //fluse method is used to fluse the stream but do not close the stream permanently
        fos.close(); //close method is used to close the stream permanently

        FileInputStream fis=new FileInputStream(file);
        //System.out.println(fis.read()); //It returns the ASCII value or byte value.
        //If we have to print the character which is present in the file, char should be cast.
       // System.out.println((char)fis.read()); //but It will return only one character
        //If we have to print all the character, we will use while loop

        int i=fis.read();
        while(!(i==-1))
        {
            char c=(char) i;
            System.out.print(c);
            i=fis.read();
        }
        fis.close();

    }
}
