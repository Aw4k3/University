import java.awt.*;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.*;

public class OutlinePage extends JPanel implements TreeSelectionListener{
    private int fontsize = 18;
    private DefaultMutableTreeNode rootnode = new DefaultMutableTreeNode("Top Level");
    private JTree tree = new JTree(this.rootnode);
    private JScrollPane outlinescrollpanel = new JScrollPane(this.tree);

    private JPanel reorderpanel = new JPanel();
    private JButton moveupbutton = new JButton("^");
    private JButton movedownbutton = new JButton("v");
    private JButton moveleftbutton = new JButton("<");
    private JButton moverightbutton = new JButton(">");

    public OutlinePage() {
        // Setup Tree
        rootnode.add(new DefaultMutableTreeNode("a"));
        rootnode.add(new DefaultMutableTreeNode("b"));
        rootnode.add(new DefaultMutableTreeNode("c"));
        this.tree.setFont(new Font("Regular", Font.PLAIN, fontsize));
        this.tree.addTreeSelectionListener(OnNodeSelect);
        this.add(this.outlinescrollpanel);

        // Setup Reordering Buttons
        this.reorderpanel.setBorder(BorderFactory.createTitledBorder("Reorder"));
        this.reorderpanel.add(this.moveupbutton);
        this.reorderpanel.add(this.movedownbutton);
        this.reorderpanel.add(this.moveleftbutton);
        this.reorderpanel.add(this.moverightbutton);
        this.add(this.reorderpanel);

        // Setup Panel
        this.setBorder(BorderFactory.createTitledBorder("Outline"));
        this.setLayout(new BoxLayout(this, 1));
    }

    public void OnNodeSelect(TreeSelectionEvent e) {
        
    }
}
