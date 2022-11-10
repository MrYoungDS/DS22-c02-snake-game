package queue;

import java.util.Iterator;

public class LinkedQueue<T> implements QueueInterface<T> {

    private QNode<T> front;
    private QNode<T> rear;
    private int size;

    @Override
    public T dequeue() {
        if (isEmpty())
        {
            throw new IllegalStateException("Empty queue");
        }
        else {
            T result = front.getElement();
            if (size == 1)
            {
                front = null;
                rear = null;
            }
            else
            {
                front = front.getPrevious();
                front.setNext(null);
            }
            size--;
            return result;
        }
    }

    @Override
    public T peek() {
        if (isEmpty())
        {
            throw new IllegalStateException("Empty queue");
        }
        else
        {
            return front.getElement();
        }
    }

    @Override
    public QueueInterface<T> enqueue(T elem) {
        if (isEmpty())
        {
            front = new QNode<>(elem);
            rear = front;
        }
        else
        {
            QNode temp = new QNode<>(elem);
            temp.setNext(rear);
            rear.setPrevious(temp);
            rear = temp;
        }
        size++;
        return this;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        // use StringBuilder because it's faster and more memory efficient
        StringBuilder result = new StringBuilder();
        result.append("[");
        // start at the front of the list
        QNode<T> copy = this.front;
        while (copy != null)
        {
            result.append(copy.getElement().toString());
            // move to the next node
            copy = copy.getNext();
        }
        return result.append("]").toString();
    }

    @Override
    public Iterator<T> iterator()
    {
        return null;
    }
}
