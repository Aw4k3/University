package com.mycompany.fsdswingworkshop;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Challenge {
    public static DataViewer dataViewer = new DataViewer();
    
    public static void displayFile(String path) {
        try {
            // Create FileReader, Scanner and ArrayList
            FileReader filereader = new FileReader(path);
            Scanner scanner = new Scanner(filereader);
            ArrayList<String> lines = new ArrayList<>();
            
            // Read lines of readfile.txt and add to ArrayList
            while (scanner.hasNextLine()) lines.add(scanner.nextLine());

            // Close Scanner
            scanner.close();
            
            // Add lines to JTextArea
            dataViewer.textPanel.textDisplay.setText(String.join("\n", lines));
            } catch (FileNotFoundException e) {
                System.out.println(e.toString());
            }
            
            // Render
            dataViewer.pack();
    }
}
