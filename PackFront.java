import javax.swing.*;
import java.awt.event.*;

public class PackFront extends JFrame implements ActionListener {

    JTextField folderField, outputField;
    JButton packButton;

    PackFront() {

        setTitle("Pack Files");
        setSize(500, 300);
        setLayout(null);

        JLabel l1 = new JLabel("Folder Name:");
        l1.setBounds(50, 50, 100, 30);

        folderField = new JTextField();
        folderField.setBounds(170, 50, 200, 30);

        JLabel l2 = new JLabel("Output File:");
        l2.setBounds(50, 100, 100, 30);

        outputField = new JTextField();
        outputField.setBounds(170, 100, 200, 30);

        packButton = new JButton("PACK");
        packButton.setBounds(170, 170, 100, 40);

        add(l1);
        add(folderField);
        add(l2);
        add(outputField);
        add(packButton);

        packButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try {

            String folder = folderField.getText();
            String output = outputField.getText();

            Packer.pack(folder, output);

            JOptionPane.showMessageDialog(this,
                    "Packing Completed");

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(this,
                    "Error");
        }
    }
}