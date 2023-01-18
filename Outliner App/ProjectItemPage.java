import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProjectItemPage extends JPanel {
    // UI Components
    private JButton closebutton = new JButton("×");
    private JLabel projectnamelabel = new JLabel("Untitled");


    public ProjectItemPage(String name) {
        this.add(this.closebutton);
        this.add(this.projectnamelabel);
        this.projectnamelabel.setText(name);
    }
}
