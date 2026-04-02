package Basics.advanced;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileRWDef {
    public static void main(String[] args) throws IOException {
        System.out.println();
        FW fw = new FW();
        fw.write();
        fw.bufRead();
    }
}

class FW {
    void read() throws IOException {
        FileReader reader = new FileReader("sample.txt");
        int data;
        while ((data = reader.read()) != -1) {
            System.out.println((char) data);
        }
        reader.close();
    }

    void bufRead() throws IOException {
        BufferedReader bReader = new BufferedReader(new FileReader("sample.txt"));
        String line;
        while ((line = bReader.readLine()) != null) {
            System.out.println(line);
        }
        bReader.close();
    }

    void write() throws IOException {
        FileWriter writer = new FileWriter("sample.txt");
        writer.write("Hi, Good Morning...");
        writer.close();
    }

    void bufWrite() throws IOException {
        FileWriter writer = new FileWriter("sample.txt");
        writer.write("Hi, Good Morning...");
        writer.close();
    }
}
