import java.io.*;
import java.util.*;
import java.lang.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Delete {
    
    
    private int start;
    private int end;   
    private String fileName;
    private String fileName2;
    

    public void Delete(int f, int i, String l, String e) {
        start = f;
        end = i;
        fileName = l;
        fileName2 = e;
        runDelete();
    }

    
    public void runDelete() {
        try {
        Writer writer = null;
        writer = new BufferedWriter(new OutputStreamWriter(
        new FileOutputStream(fileName2), "utf-8"));
        for (int i = start; i <= end; i++){
        String temp = Files.readAllLines(Paths.get(fileName)).get(i);
        writer.write(temp + "\n");
    }
        writer.close();
    }
    catch (IOException ex) {
    }
        }
    
}

