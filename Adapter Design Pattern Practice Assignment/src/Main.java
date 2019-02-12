import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        //Testing DoublyLinkedList
        System.out.println("Creating a DoublyLinkList...");
        DoublyLinkedList<String> ddl = new DoublyLinkedList<>();
        System.out.println("Assigning the value \"Hello\" to head node...");
        ddl.addFirst("Hello");
        System.out.println("Assigning the value \"world\" to tail node...");
        ddl.addLast("world");
        System.out.println("Return head node value: " + ddl.getHeadNode().getNodeData());
        System.out.println("Return value of the node next to head node: " + ddl.getHeadNode().getNextNode().getNodeData());
        System.out.println("Assigning the value \"hi\" to head node...");
        ddl.addFirst("hi");
        System.out.println("Assigning the value \"There\" to tail node...");
        ddl.addLast("There");
        System.out.println("Return head node value: " + ddl.getHeadNode().getNodeData());
        System.out.println("Return value of the node next to head node: " + ddl.getHeadNode().getNextNode().getNodeData());
        System.out.println("Return the tail node value: " + ddl.getTailNode().getNodeData());
        System.out.println("Printing the DoublyLinkedList...");
        printList(ddl.iterator());
        System.out.println("\n");

        //Testing GenericStack
        System.out.println("Creating a stack...");
        GenericStack<String> stack = new GenericStack<>();
        System.out.println("Adding first value to the stack...");
        stack.push("First");
        System.out.println("Adding second value to the stack...");
        stack.push("Second");
        System.out.println("Adding third value to the stack...");
        stack.push("Third");
        System.out.print("The size of the stack is: ");
        System.out.println(stack.size());
        System.out.print("The value of the last item in the stack is: ");
        System.out.println(stack.peek());
        System.out.println("Printing the stack...");
        printList(stack.iterator());
        System.out.print("Removing the last item from the stack and return its value: ");
        System.out.println(stack.pop());
        System.out.print("The value of the new last item in the stack is: ");
        System.out.println(stack.peek());
        System.out.print("The new size of the stack is: ");
        System.out.println(stack.size());
        System.out.println("Printing the stack...");
        printList(stack.iterator());
        System.out.println("\n");

        //Testing GenericQueue
        System.out.println("Creating a queue...");
        GenericQueue<String> queue = new GenericQueue();
        System.out.println("Adding first item to the queue...");
        queue.enqueue("First");
        System.out.println("Adding second item to the queue...");
        queue.enqueue("Second");
        System.out.println("Adding last item to the queue...");
        queue.enqueue("Last");
        System.out.println("The queue size is: " + queue.size());
        System.out.println("The first item in the queue is: " + queue.peek());
        System.out.println("Printing the queue...");
        printList(queue.iterator());
        System.out.println("Removing the first item from the queue and display its value: " + queue.dequeue());
        System.out.println("The size of the new queue is: " + queue.size());
        System.out.println("The first item in the queue now is: " + queue.peek());
        System.out.println("Printing the queue...");
        printList(queue.iterator());

    }
    public static void printList(Iterator<DoublyLinkedNode> iterator){
        System.out.print("null <--> ");
        while (iterator.hasNext()){
            DoublyLinkedNode node = iterator.next();
            System.out.print(node.getNodeData() + " <--> ");
        }
        System.out.println("null.");
    }
}