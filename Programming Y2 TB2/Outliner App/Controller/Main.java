package uk.ac.kingston.ci5105.outliner.Controller;

import javax.swing.tree.DefaultMutableTreeNode;
import uk.ac.kingston.ci5105.outliner.View.Window;

public class Main {
    private static Window window = null;
    public static DefaultMutableTreeNode trackednode = null;
    
    public static void main(String[] args) {
        window = new Window();
        window.GetTree().addTreeSelectionListener(new SelectNode());
        window.GetEditorTextArea().setEnabled(false);
        
    }

    public static Window GetWindow() {
        return window;
    }
}