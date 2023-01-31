import javax.swing.*;
import javax.swing.tree.*;

public class EditorPane extends JPanel {
    private JTextArea nodetext = new JTextArea();

    public EditorPane() {
        // Setup Text Editor
        this.nodetext.setBorder(BorderFactory.createTitledBorder("Text"));
        this.add(this.nodetext);

        // Setup Panel
        this.setBorder(BorderFactory.createTitledBorder("Node Editor"));
        this.setLayout(new BoxLayout(this, 1));
    }

    static public void BindNode(EditorPane editor, DefaultMutableTreeNode n) {
        editor.nodetext.setText(n.getUserObject().toString());
    }
}
