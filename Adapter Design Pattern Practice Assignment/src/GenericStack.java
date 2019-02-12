import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

//Creating a GenericStack class by using an Object Adapter and adapt the DLL class.
public class GenericStack<T> extends AbstractCollection implements Collection {
    private DoublyLinkedList linkedList;

    //Creating the constructor
    public GenericStack(){
        linkedList = new DoublyLinkedList();
    }

    //Creating the push method by adapting the adaptee addLast method.
    public void push(T data){
        linkedList.addLast(data);
    }

    //Creating the pop method by adapting the adaptee getTailNode and removeLast methods.
    public T pop(){
        DoublyLinkedNode node = linkedList.getTailNode();
        linkedList.removeLast();
        return (T)node.getNodeData();
    }

    //Creating the peek method by adapting the adaptee getTailNode method.
    public T peek(){
        return (T)linkedList.getTailNode().getNodeData();
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
