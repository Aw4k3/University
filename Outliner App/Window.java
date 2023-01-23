import java.awt.*;
import javax.swing.*;

public class Window extends JFrame {
    // UI Components
    private GridBagLayout gridlayout = new GridBagLayout();
    private GridBagConstraints gridconstraints = new GridBagConstraints(); // This system is so shit >:(
    
    // Toolbar Components
    private JToolBar toolbarpanel = new JToolBar();
    private JButton newfilebutton = new JButton("New");
    private JButton openfilebutton = new JButton("Open");
    private JButton savefilebutton = new JButton("Save");
    private JButton newtreecomponentbutton = new JButton("+");
    
    // Panels
    private OutlinePage outlinepanel = new OutlinePage();
    private EditorPane editorpane = new EditorPane();
    
    public Window() {
        // Setup UI
        this.setTitle("Outliner");
        this.setPreferredSize(new Dimension(800, 600));
        this.setLayout(this.gridlayout);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setup Grid Layout
        this.gridconstraints.fill = GridBagConstraints.BOTH;
        this.gridconstraints.weightx = 1; // Percentage of the window to fill
        this.gridconstraints.weighty = 1; // This is stupid, why is it called weight??? >:(
        this.gridlayout.setConstraints(this, gridconstraints);
        
        // Toolbar Stuff
        this.toolbarpanel.setFloatable(false);
        this.toolbarpanel.add(this.newfilebutton);
        this.toolbarpanel.add(this.openfilebutton);
        this.toolbarpanel.add(this.savefilebutton);
        this.toolbarpanel.add(this.newtreecomponentbutton);

        this.AddToGrid(this.toolbarpanel, 0, 0, 2, 1);
        this.AddToGrid(this.outlinepanel, 0, 1, 1, 1);
        this.AddToGrid(this.editorpane, 1, 1, 1, 1);

        // Render
        this.pack();
        this.setVisible(true);
    }

    private void AddToGrid(Component component, int cellx, int celly, int spanx, int spany) {
        this.gridconstraints.gridx = cellx;
        this.gridconstraints.gridy = celly;
        this.gridconstraints.gridwidth = spanx;
        this.gridconstraints.gridheight = spany;
        this.add(component, gridconstraints);
    }
}