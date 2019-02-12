import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

//Creating a GenericQueue class by using an Object Adapter and adapt the DLL class.
public class GenericQueue<T> extends AbstractCollection implements Collection {
    private DoublyLinkedList linkedList;

    //Creating the constructor
    public GenericQueue(){
        linkedList = new DoublyLinkedList();
    }

    //Creating the enqueue method by adapting the adaptee addLast method.
    public void enqueue(T data){
        linkedList.addLast(data);
    }

    //Creating the dequeue method by adapting the adaptee getHeadNode and removeFirst methods.
    public T dequeue(){
        DoublyLinkedNode node = linkedList.getHeadNode();
        linkedList.removeFirst();
        return (T)node.getNodeData();
    }

    //Creating the peek method by adapting the adaptee getHeadNode method.
    public T peek(){
        return (T)linkedList.getHeadNode().getNodeData();
    }

    //Implementing the iterator method of the abstract class by returning a DoublyLinkedListIterator object
    //that take the headNode and count from the adaptee as its parameters.
    @Override
    public Iterator iterator() {
        return new DoublyLinkedListIterator(linkedList.getHeadNode(), linkedList.size());
    }

    //Implementing the size method of the abstract class
    // by returning the number of nodes in the adaptee
    @Override
    public int size() {
        return linkedList.size();
    }
}
