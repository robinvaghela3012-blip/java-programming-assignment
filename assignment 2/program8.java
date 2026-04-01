import javax.swing.*;
import java.awt.event.*;

public class InvestmentCalculator {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Investment Calculator");

        JLabel l1 = new JLabel("Principal:");
        JLabel l2 = new JLabel("Rate:");
        JLabel l3 = new JLabel("Time:");
        JLabel result = new JLabel("Result:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        JButton btn = new JButton("Calculate");

        l1.setBounds(20, 20, 100, 30);
        t1.setBounds(120, 20, 120, 30);

        l2.setBounds(20, 60, 100, 30);
        t2.setBounds(120, 60, 120, 30);

        l3.setBounds(20, 100, 100, 30);
        t3.setBounds(120, 100, 120, 30);

        btn.setBounds(60, 150, 120, 30);
        result.setBounds(20, 200, 200, 30);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int p = Integer.parseInt(t1.getText());
                int r = Integer.parseInt(t2.getText());
                int t = Integer.parseInt(t3.getText());

                int si = (p * r * t) / 100;

                result.setText("Interest: " + si);
            }
        });

        frame.add(l1); frame.add(t1);
        frame.add(l2); frame.add(t2);
        frame.add(l3); frame.add(t3);
        frame.add(btn); frame.add(result);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}