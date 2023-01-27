import javax.swing.*;
import java.awt.*;

public class JogoGourmetGuilherme {

    public static void main(String[] args) {

        Tree tree = new Tree();

        JFrame frame = new JFrame();
        frame.setTitle("Jogo Gourmet Guilherme");
        frame.setSize(400, 100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton();
        button.setText("Iniciar");

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.add(button);

        frame.add(panel);

        button.addActionListener(actionEvent -> {

            JOptionPane.showMessageDialog(null, "Pense em um prato que gosta");

            tree.ask();

        });

        frame.setVisible(true);

    }

}
