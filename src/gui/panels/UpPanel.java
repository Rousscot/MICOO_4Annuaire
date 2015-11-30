package gui.panels;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Created by ferlicot & rousseau at Las Vegas
 */
public class UpPanel extends JPanel {
    protected JList<String> jList;
    protected JScrollPane jScrollPane;
    protected DefaultListModel<String> defaultModel;
    protected Border border;

    public UpPanel(String borderName) {
        initJList();
        initScrollPane(borderName);
        this.add(jScrollPane);
    }

    public void initJList() {
        jList = new JList();
        defaultModel = new DefaultListModel<>();
        jList.setModel(defaultModel);
    }

    public void initScrollPane(String borderName) {
        border = new TitledBorder(borderName);
        jScrollPane = new JScrollPane(jList);
        jScrollPane.setBorder(border);
        jScrollPane.setPreferredSize(new Dimension(250, 250));
    }

    public JList<String> getJList() {
        return jList;
    }

    public DefaultListModel<String> getDefaultModel() {
        return defaultModel;
    }
}
