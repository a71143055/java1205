package GUI.view;

import javax.swing.*;
import java.awt.*;

public class OrderInfoView extends JPanel {
    public OrderInfoView() {
        setLayout(new BorderLayout());

        JPanel panN = new JPanel(new GridLayout(2,1));
        JPanel panC = new JPanel();

        JPanel pan1 = new JPanel();
        JPanel pan2 = new JPanel();

        panN.add(pan1);
        panN.add(pan2);

        add(panN, "North");
        add(panC, "Center");
    }
}