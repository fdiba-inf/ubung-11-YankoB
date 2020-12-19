package exercise11;

public class LinkedQueue {
    private Node frontNode;
    private Node backNode;

    public boolean isEmpty() {
        return frontNode == null;
    }

    public void offer(String data) {
        Node newNode= new Node(data);
        if (isEmpty()){
            frontNode = newNode;
            backNode = newNode;
        }
        else{
            backNode.setNextNode(newNode);
            backNode = newNode;
        }
    }

    public String poll() {
        if(!isEmpty()){
            String data = frontNode.getData();
            frontNode = frontNode.getNextNode();
            return data;
        }

        return null;
    }

    @Override
    public String toString() {
        return NodeUtils.createNodeTraversalString(frontNode);
    }
}