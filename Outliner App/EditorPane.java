import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class EditorPane extends JPanel {
    private DefaultMutableTreeNode nodebinding;
    private JTextArea nodetext = new JTextArea();

    public EditorPane() {
        // Setup Text Editor
        this.nodetext.setBorder(BorderFactory.createTitledBorder("Text"));
        this.add(this.nodetext);

        // Setup Panel
        this.setBorder(BorderFactory.createTitledBorder("Node Editor"));
        this.setLayout(new BoxLayout(this, 1));
    }

    public void BindNode(DefaultMutableTreeNode n) {
        nodetext.setText(n.getUserObject().toString());
    }
}
