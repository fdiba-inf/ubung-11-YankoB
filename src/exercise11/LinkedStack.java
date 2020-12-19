
package exercise11;

public class LinkedStack {
    private Node topNode;

    public boolean isEmpty() {
        return topNode == null;

    }

    public void push(String data) {

        if (isEmpty()){
            topNode=new Node(data);
        }
        else{
            Node node= new Node(data);
            node.setNextNode(topNode);
            topNode = node;
        }
    }

    public String pop() {
        if(!isEmpty()){
            String data = topNode.getData();
            topNode = topNode.getNextNode();
            return data;
        }
        return null;
    }

    @Override
    public String toString() {
        return NodeUtils.createNodeTraversalString(topNode);
    }
}