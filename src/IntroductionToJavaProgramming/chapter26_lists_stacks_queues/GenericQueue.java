package IntroductionToJavaProgramming.chapter26_lists_stacks_queues;

import java.util.LinkedList;

public class GenericQueue<E> {
    private LinkedList<E> list = new LinkedList<>();

    public void enqueue(E e) {
        list.addLast(e);
    }

    public E dequeue(){
        return list.removeFirst();
    }

    public int getSize(){
        return list.size();
    }
}
