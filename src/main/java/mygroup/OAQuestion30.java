package mygroup;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.*;

public class OAQuestion30 {

    public static void main(String[] args) throws Exception {

        File file=new File("data.txt");
        FileWriter output= new FileWriter(file);

        //which of the following is correct.

        //1
//        try {
//            Stream.of('0','1','2','3','4','5').forEach(output::write);
//        }
//        catch (Exception e) {}

        //2
        PrintWriter printWriter = new PrintWriter(output);
        Stream.of('0','1','2','3','4','5').forEach(printWriter::write);

//        //3
//        for (int i=0;i<=5;i++){
//            file.setWritable(i);
//            file.toString();
//        }

        //4
        for (int i=0;i<=5;i++){
            output.write(String.valueOf(i));
        }

        //5
        output.write(new char[]{'0','1','2','3','4','5'});


        output.flush();
    }
}
