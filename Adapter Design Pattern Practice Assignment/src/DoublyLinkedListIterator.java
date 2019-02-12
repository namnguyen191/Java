import java.util.Iterator;

//Creating a separate iterator for the DLL
public class DoublyLinkedListIterator implements Iterator {
    //This iterator has a DoublyLinkedNode, which will be the headNode of the DLL, and the size of the DLL
    //as it properties
    DoublyLinkedNode node;
    int count;

    //Creating the constructor
    public DoublyLinkedListIterator(DoublyLinkedNode node, int count){
        this.node = node;
        this.count = count;
    }

    //Implementing hasNext by returning false if the size of the LinkedList is 0 or the node is null
    //else return true
    @Override
    public boolean hasNext() {
        if (count == 0 || this.node == null) return false;
        else return true;

    }

    //Implementing next by return the next node while setting the current node to be the next node
    @Override
    public Object next() {
        DoublyLinkedNode tempNode = this.node;
        if (this.node != null)
        this.node = this.node.getNextNode();
        return tempNode;
    }

}
