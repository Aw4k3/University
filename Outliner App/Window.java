import java.awt.*;
import javax.swing.*;

public class Window extends JFrame {
    // UI Components
    private GridBagLayout gridlayout = new GridBagLayout();
    private GridBagConstraints gridconstraints = new GridBagConstraints(); // This system is so shit >:(
    private JPanel outlinepanel = new JPanel();
    private JPanel documentpanel = new JPanel();
    private JTextArea documenttextarea = new JTextArea();
    private JScrollPane doumentscrollpane = new JScrollPane(this.documenttextarea);
    
    public Window() {
        // Setup UI
        this.setTitle("Outliner");
        this.setPreferredSize(new Dimension(800, 600));
        this.setLayout(gridlayout);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.gridconstraints.fill = GridBagConstraints.BOTH;
        this.gridconstraints.weightx = 1; // Percentage of the window to fill
        this.gridconstraints.weighty = 1; // This is stupid, why is it called weight??? >:(
        this.gridlayout.setConstraints(this, gridconstraints);

        this.outlinepanel.setBorder(BorderFactory.createTitledBorder("Outline"));
        this.documentpanel.setBorder(BorderFactory.createTitledBorder("Document"));
        this.outlinepanel.setLayout(new BorderLayout());
        this.documentpanel.setLayout(new BorderLayout());
        this.documentpanel.add(this.doumentscrollpane);

        this.AddToGrid(outlinepanel, 0, 0);
        this.AddToGrid(documentpanel, 1, 0);

        // Render
        this.pack();
        this.setVisible(true);
    }

    private void AddToGrid(Component component, int cellx, int celly) {
        this.gridconstraints.gridx = cellx;
        this.gridconstraints.gridy = celly;
        this.add(component, gridconstraints);
    }
}