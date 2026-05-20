import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {

    JButton packBtn, unpackBtn;

    Main() {

        setTitle("Packer Unpacker");
        setSize(400, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        packBtn = new JButton("Pack Files");
        unpackBtn = new JButton("Unpack Files");

        packBtn.setBounds(50, 50, 120, 40);
        unpackBtn.setBounds(200, 50, 120, 40);

        add(packBtn);
        add(unpackBtn);

        packBtn.addActionListener(this);
        unpackBtn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == packBtn) {
            new PackFront();
        }

        if (e.getSource() == unpackBtn) {
            new UnpackFront();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}