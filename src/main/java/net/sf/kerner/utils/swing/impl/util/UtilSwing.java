package net.sf.kerner.utils.swing.impl.util;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class UtilSwing {

    public static JComponent buildInfoPanelTextBorder(final JComponent content, final String title) {
        final JPanel result = new JPanel(new BorderLayout());
        result.setBorder(BorderFactory.createTitledBorder(title));
        result.add(content, BorderLayout.CENTER);
        return result;
    }

    public static JComponent buildInfoPanelTextBorder(final JLabel content, final String title) {
        content.setHorizontalAlignment(SwingConstants.CENTER);
        content.setVerticalAlignment(SwingConstants.CENTER);
        content.setOpaque(true);
        return buildInfoPanelTextBorder((JComponent) content, title);
    }

    public static JComponent buildInfoPanelTextBorderScroll(final JComponent content, final String title) {
        final JPanel result = new JPanel(new BorderLayout());
        result.setBorder(BorderFactory.createTitledBorder(title));
        final JScrollPane scroll = new JScrollPane(content);
        result.add(scroll, BorderLayout.CENTER);
        return result;
    }

    private UtilSwing() {
    }

}
