/*
 * Created by JFormDesigner on Thu Aug 24 23:49:29 CST 2017
 */

package view;

import org.jdesktop.swingx.*;
import org.jdesktop.swingx.VerticalLayout;

import javax.swing.*;
import java.awt.*;

/**
 * @author heheda
 */
public class Select extends JFrame {
    public Select() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        panel2 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(new VerticalLayout());

            //======== panel2 ========
            {
                panel2.setLayout(new HorizontalLayout());

                //---- label1 ----
                label1.setText("\u8bf7\u8f93\u5165\u7f16\u53f7\u8fdb\u884c\u67e5\u8be2");
                panel2.add(label1);
                panel2.add(textField1);
            }
            panel1.add(panel2);

            //---- button1 ----
            button1.setText("\u67e5\u8be2");
            panel1.add(button1);
        }
        contentPane.add(panel1);
        panel1.setBounds(85, 20, 155, 50);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JPanel panel2;
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
