package uk.ac.kingston.ci5105.outliner.Controller;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditorController {
    public DocumentListener DocumentChangedListener = new DocumentListener() {
        @Override
        public void changedUpdate(DocumentEvent e) {
            
        }

        @Override
        public void insertUpdate(DocumentEvent e) {
            
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            
        }
    };

    /**
     * Applied changes made in the editor to the selected node. The selected node is tracked in the Main.java class.
     */
    public ActionListener ApplyChanges = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(Main.trackednode.getUserObject().toString());
            if (Main.trackednode != null) {
                Main.trackednode.setUserObject(Main.GetWindow().GetEditorTextArea().getText());
            }
        }
    };

    /**
     * Creates a new DefaultMutableTreeNode object and attached it to the currently selected node.
     * If none is selected then a new node will not be created.
     */
    public ActionListener CreateNewNode = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(Main.trackednode.getUserObject().toString());
            if (Main.trackednode != null) {
                Main.trackednode.add(new DefaultMutableTreeNode("New Node"));
                ((DefaultTreeModel)Main.GetWindow().GetTree().getModel()).reload();
            }
        }
    };

    public ActionListener DeleteNode = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(Main.trackednode.getUserObject().toString());
            if (Main.trackednode != null) {
                Main.trackednode.removeFromParent();
                ((DefaultTreeModel)Main.GetWindow().GetTree().getModel()).reload();
            }
        }
    };
}