import com.dev4ag.RandomAccessFileBigEndian;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static final String PATH ="" /*FileName goes here*/;
    public static void main(String[] args) {
        try {
            RandomAccessFileBigEndian in = new RandomAccessFileBigEndian(PATH,"r");
            System.out.println("File Position: "+in.getFilePointer());
            int time = in.readIntBE();
            System.out.println("File Position: "+in.getFilePointer());
            System.out.println("Hex Value: "+Integer.toHexString(time));
            System.out.println("BIN Value: "+Integer.toBinaryString(time));
            int time_backUp = time;
            time = time/1000;
            int seconds = time % 60;
            time = time/60;
            int minutes = time % 60;
            time = time/60;
            int hours = time;

            System.out.println("Time: "+hours+":"+minutes+":"+seconds);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
