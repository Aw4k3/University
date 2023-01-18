import javax.swing.*;
import java.awt.*;

public class OutlinePage extends JPanel {
    private JTree outlinetree = new JTree();
    private JScrollPane outlinecrollpanel = new JScrollPane(this.outlinetree);

    public OutlinePage() {
        this.setLayout(new BorderLayout());
        this.add(outlinecrollpanel);
    }
}
