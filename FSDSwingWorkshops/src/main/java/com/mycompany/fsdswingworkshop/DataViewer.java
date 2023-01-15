package com.mycompany.fsdswingworkshop;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DataViewer extends JFrame {
    // Create Parts of GUI
    TextAreaPanel textPanel = new TextAreaPanel();
    JButton loadFile = new JButton();
    JButton quitButton = new JButton();
    GridLayout grid = new GridLayout(3, 1);
    
    public DataViewer() {
        // Setup UI Components
        this.setTitle("Text File Reader");
        this.setPreferredSize(new Dimension(600, 600));
        this.setLayout(grid);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.loadFile.setText("Load File");
        this.loadFile.addActionListener(e -> LoadFile_OnClick(e));
        this.quitButton.setText("Quit");
        this.quitButton.addActionListener(e -> QuitButton_OnClick(e));
        
        this.add(this.textPanel);
        this.add(this.loadFile);
        this.add(this.quitButton);
        this.pack();
        this.setVisible(true);
    }

    private void LoadFile_OnClick(ActionEvent e) {
        System.out.println("Load file button pressed");
        try {
            FileDialog jfiledialog = new FileDialog(this, "CHoose a text file", FileDialog.LOAD);
            jfiledialog.setVisible(true);
            String path = jfiledialog.getDirectory() + jfiledialog.getFile();
            if (path.endsWith(".txt")) Challenge.displayFile(path);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    private void QuitButton_OnClick(ActionEvent e) {
        this.dispose();
    }
}
