package com.mycompany.fsdswingworkshop;

import java.awt.*;
import javax.swing.*;

public class TextAreaPanel extends JPanel {
    JTextArea textDisplay = new JTextArea();
    JScrollPane jscrollpane = new JScrollPane(this.textDisplay);
    BorderLayout borderlayout = new BorderLayout();

    public TextAreaPanel() {
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.borderlayout.addLayoutComponent(this.jscrollpane, BorderLayout.CENTER);
        this.textDisplay.setEditable(false);
        this.setLayout(this.borderlayout);
        this.add(this.jscrollpane);
    }
}