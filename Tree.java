import javax.swing.*;

public class Tree {

    private Node root;

    public Tree() {

        Node node = new Node("Bolo de Chocolate", null, null);

        this.setRoot(new Node("massa", new Node("Lasanha", null, null), node));

    }

    public void ask() {
        this.setRoot(ask(this.getRoot()));
    }

    private Node ask(Node node) {

        // Achei melhor utilizar Recursividade com apenas 1 tipo
        // Mas entendo que existem situações onde Polimorfismo ou Visitor Pattern seriam mais adequados

        if (node.isLeaf()) {

            if (JOptionPane.showConfirmDialog(null, "O prato que você pensou é " + node.getText() + "?", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                node.setTrueNode(ask(node.getTrueNode()));
            } else {
                node.setFalseNode(ask(node.getFalseNode()));
            }

        } else {

            if (JOptionPane.showConfirmDialog(null, "O prato que você pensou é " + node.getText() + "?", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Acertei!");
            } else {
                JOptionPane.showMessageDialog(null, "Desisto!");
                String answer = JOptionPane.showInputDialog(null, "Qual prato você pensou?", "", JOptionPane.QUESTION_MESSAGE);
                if (answer != null && !answer.trim().isEmpty()) {
                    answer = answer.trim();
                    String feature = JOptionPane.showInputDialog(null, answer + " é __________ mas " + node.getText() + " não.", "", JOptionPane.QUESTION_MESSAGE);
                    if (feature != null && !feature.trim().isEmpty()) {
                        feature = feature.trim();
                        node = new Node(feature, new Node(answer, null, null), node);
                    }
                }
            }
        }

        return node;

    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

}
