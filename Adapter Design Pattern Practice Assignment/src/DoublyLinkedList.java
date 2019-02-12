import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public class DoublyLinkedList<T> extends AbstractCollection implements Collection{
    private DoublyLinkedNode<T> headNode;
    private DoublyLinkedNode<T> tailNode;
    private int count;

    public void addFirst(T nodeData) {
        DoublyLinkedNode<T> tempNode = headNode;
        headNode = new DoublyLinkedNode<T>(nodeData);
        headNode.setNextNode(tempNode);
        count++;
        if (count == 1)
            tailNode = headNode;
        else
            tempNode.setPreviousNode(headNode);
    }

    public void addLast(T nodeData){
        DoublyLinkedNode<T> newNode = new DoublyLinkedNode<T>(nodeData);
        if(count==0)headNode = newNode;
        else {
            tailNode.setNextNode(newNode);
            newNode.setPreviousNode(tailNode);
        }
            tailNode = newNode;
            count++;
    }

    public void removeFirst(){
        if(count!=0){
            headNode = headNode.getNextNode();
            count--;
            if(count==0)
                tailNode = null;
            else
                headNode.setPreviousNode(null);
        }
    }

    public void removeLast(){
        if(count==1)
        {
            headNode = null;
            tailNode = null;
        }
        else
        {
            tailNode.getPreviousNode().setNextNode(null);
            tailNode = tailNode.getPreviousNode();
        }
        count--;
    }

    //Getters and Setters
    public DoublyLinkedNode<T> getHeadNode() {
        return headNode;
    }

    public DoublyLinkedNode<T> getTailNode() {
        return tailNode;
    }

    //Adding a toString that print out all the nodes' values of the DoublyLinkedList
    public String toString(){
        String str = "";
        DoublyLinkedNode currentNode = headNode;
        while (currentNode != null){
            str += currentNode.getNodeData() + " ";
            currentNode = currentNode.getNextNode();
        }
        return str;
    }

    //Implementing the iterator method of the abstract class by returning a DoublyLinkedListIterator object
    //that take the headNode and count as its parameters.
    @Override
    public Iterator iterator() {
        return new DoublyLinkedListIterator(headNode, count);
    }

    //Implementing the size method of the abstract class
    // by returning the number of nodes in the DoublyLinkedList
    @Override
    public int size() {
        return count;
    }
}