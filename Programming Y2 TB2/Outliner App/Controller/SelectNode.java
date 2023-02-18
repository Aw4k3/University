package uk.ac.kingston.ci5105.outliner.Controller;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class SelectNode implements TreeSelectionListener {

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        Main.GetWindow().GetEditorTextArea().setEnabled(true);
        DefaultMutableTreeNode node = (DefaultMutableTreeNode)Main.GetWindow().GetTree().getLastSelectedPathComponent();
        Main.GetWindow().GetEditorTextArea().setText(node.getUserObject().toString());
        Main.trackednode = node;
    }
}
