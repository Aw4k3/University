import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class FutureWindow extends JFrame {
    // UI Components
    private GridBagLayout gridlayout = new GridBagLayout();
    private GridBagConstraints gridconstraints = new GridBagConstraints(); // This system is so shit >:(
    
    // Toolbar Components
    private JToolBar toolbarpanel = new JToolBar();
    private JButton newfilebutton = new JButton("New");
    private JButton openfilebutton = new JButton("Open");
    private JButton savefilebutton = new JButton("Save");
    private JButton newtreecomponentbutton = new JButton("+");

    // File List Components
    private JPanel projectlistpanel = new JPanel();
    private DefaultListModel<ProjectItemPage> projectlistmodel = new DefaultListModel<ProjectItemPage>();
    private JList<ProjectItemPage> filelist = new JList<ProjectItemPage>(this.projectlistmodel);
    private JScrollPane projectscrollpanel = new JScrollPane(this.filelist);
    
    // Outline Components
    private JPanel outlinepanel = new JPanel();
    private JTree outlinetree = new JTree();
    private JScrollPane outlinecrollpanel = new JScrollPane(this.outlinetree);
    
    public FutureWindow() {
        // Setup UI
        this.setTitle("Outliner");
        this.setPreferredSize(new Dimension(800, 600));
        this.setLayout(gridlayout);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.toolbarpanel.setFloatable(false);
        this.toolbarpanel.add(this.newfilebutton);
        this.toolbarpanel.add(this.openfilebutton);
        this.toolbarpanel.add(this.savefilebutton);
        this.toolbarpanel.add(this.newtreecomponentbutton);

        this.gridconstraints.fill = GridBagConstraints.BOTH;
        this.gridconstraints.weightx = 1; // Percentage of the window to fill
        this.gridconstraints.weighty = 1; // This is stupid, why is it called weight??? >:(
        this.gridlayout.setConstraints(this, gridconstraints);

        // Project List Stuffs
        this.projectlistpanel.setBorder(BorderFactory.createTitledBorder("Projects"));
        this.projectlistpanel.setLayout(new BorderLayout());
        this.projectlistpanel.add(this.projectscrollpanel);
        this.projectscrollpanel.setLayout(new ScrollPaneLayout());

        // Outline Stuffs
        this.outlinepanel.setBorder(BorderFactory.createTitledBorder("Outline"));
        this.outlinepanel.setLayout(new BorderLayout());
        this.outlinepanel.add(this.outlinecrollpanel);
        
        // for (int i = 0; i < 10; i++) this.projectlistpanel.add(new ProjectItemPage("test project"));
        for (int i = 0; i < 10; i++) this.projectlistmodel.addElement(new ProjectItemPage("test project"));

        this.AddToGrid(toolbarpanel, 0, 0, 2, 1);
        this.AddToGrid(projectlistpanel, 0, 1, 1, 1);
        this.AddToGrid(outlinepanel, 1, 1, 1, 1);

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