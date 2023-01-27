public class Node {

    private String text;
    private Node trueNode;
    private Node falseNode;

    public Node(String text, Node trueNode, Node falseNode) {
        this.setText(text);
        this.setTrueNode(trueNode);
        this.setFalseNode(falseNode);
    }

    public boolean isLeaf() {

        // Achei melhor utilizar Recursividade com apenas 1 tipo
        // Mas entendo que existem situações onde Polimorfismo ou Visitor Pattern seriam mais adequados

        return this.getTrueNode() != null && this.getFalseNode() != null;

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Node getTrueNode() {
        return trueNode;
    }

    public void setTrueNode(Node trueNode) {
        this.trueNode = trueNode;
    }

    public Node getFalseNode() {
        return falseNode;
    }

    public void setFalseNode(Node falseNode) {
        this.falseNode = falseNode;
    }

}
