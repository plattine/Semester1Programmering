package Lesson15;

import java.io.FileWriter;
import java.io.IOException;

public class StoryFileWriter {
    public static void main(String[] args) {
        long startTime = System.nanoTime();


        try {
            FileWriter writer = new FileWriter("fairytaleOutput.txt");
            writer.write("Once upon a time in a small village,\n" +
                    "there lived a young programmer.");
            writer.write("This is a test of FileWriter performance.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("CPU tid (nanosekunder): " + duration);
    }
}
