package uk.ac.kingston.ci5105.outliner.View;

import java.awt.*;
import javax.swing.*;

import uk.ac.kingston.ci5105.outliner.Controller.EditorController;

public class Window extends JFrame {
    // Toolbar Components
    private JToolBar toolbar = new JToolBar();
    private JButton newfilebutton = new JButton("New");
    private JButton openfilebutton = new JButton("Open");
    private JButton savefilebutton = new JButton("Save");

    private JButton newnodebutton = new JButton("New Node");
    private JButton deletenodebutton = new JButton("Delete Node");

    // Tree Components
    private JTree tree = new JTree();
    private JScrollPane treescrollpane = new JScrollPane(this.tree);

    // Editor Components
    private JPanel editorpanel = new JPanel();
    private JScrollPane editorscrollpane = new JScrollPane(this.editorpanel);
    private JLabel textlabel = new JLabel("Text");
    private JTextArea editortextarea = new JTextArea();
    private JButton applychangesbutton = new JButton("Apply Changes");
    
    public Window() {
        EditorController ec = new EditorController();
        // Setup UI
        this.setTitle("Outliner");
        this.setPreferredSize(new Dimension(800, 600));
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Setup Toolbar
        this.newnodebutton.addActionListener(ec.CreateNewNode);
        this.deletenodebutton.addActionListener(ec.DeleteNode);

        this.toolbar.setFloatable(false);
        this.toolbar.add(this.newfilebutton);
        this.toolbar.add(this.openfilebutton);
        this.toolbar.add(this.savefilebutton);
        this.toolbar.addSeparator();
        this.toolbar.add(this.newnodebutton);
        this.toolbar.add(this.deletenodebutton);

        // Setup Editor
        // this.editortextarea.getDocument().addDocumentListener(new UpdateNode().DocumentChangedListener);
        this.applychangesbutton.addActionListener(ec.ApplyChanges);

        this.editorpanel.setLayout(new BoxLayout(this.editorpanel, BoxLayout.Y_AXIS));
        this.editorpanel.add(this.textlabel);
        this.editorpanel.add(this.editortextarea);
        this.editorpanel.add(this.applychangesbutton);

        // Render
        this.add(this.toolbar, BorderLayout.NORTH);
        this.add(new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, this.treescrollpane, this.editorscrollpane));
        this.pack();
        this.setVisible(true);
    }

    public JTree GetTree() {
        return this.tree;
    }

    public JTextArea GetEditorTextArea() {
        return this.editortextarea;
    }
}