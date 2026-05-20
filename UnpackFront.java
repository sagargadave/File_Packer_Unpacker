import javax.swing.*;
import java.awt.event.*;

public class UnpackFront extends JFrame implements ActionListener {

    JTextField packedFileField;
    JButton unpackButton;

    UnpackFront() {

        setTitle("Unpack Files");
        setSize(500, 250);
        setLayout(null);

        JLabel l1 = new JLabel("Packed File:");
        l1.setBounds(50, 50, 100, 30);

        packedFileField = new JTextField();
        packedFileField.setBounds(170, 50, 200, 30);

        unpackButton = new JButton("UNPACK");
        unpackButton.setBounds(170, 120, 120, 40);

        add(l1);
        add(packedFileField);
        add(unpackButton);

        unpackButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try {

            String packedFile = packedFileField.getText();

            Unpack.unpack(packedFile);

            JOptionPane.showMessageDialog(this,
                    "Unpacking Completed");

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(this,
                    "Error");
        }
    }
}