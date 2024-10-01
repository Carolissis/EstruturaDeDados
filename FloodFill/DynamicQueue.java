public class DynamicQueue<T> {
    private T[] data;
    private int size;
    private int front;
    private int rear;
    private int count;

    public DynamicQueue() {
        this.size = 2; // Tamanho inicial
        this.data = (T[]) new Object[size];
        this.front = 0;
        this.rear = 0;
        this.count = 0;
    }

    // Método para adicionar (enqueue) um elemento à fila
    public void add(T item) {
        if (isFull()) {
            resize();
        }
        data[rear] = item;
        rear = (rear + 1) % size;
        count++;
    }

    // Método para remover (dequeue) um elemento da fila
    public T remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila Vazia");
        }
        T item = data[front];
        data[front] = null;
        front = (front + 1) % size;
        count--;
        return item;
    }

    // Método para verificar se a fila está cheia
    private boolean isFull() {
        return count == size;
    }

    // Método para verificar se a fila está vazia
    public boolean isEmpty() {
        return count == 0;
    }

    // Método para ver o número de elementos na fila
    public int size() {
        return count;
    }

    // Método para redimensionar a fila quando cheia
    private void resize() {
        int newSize = size * 2;
        T[] newData = (T[]) new Object[newSize];

        for (int i = 0; i < count; i++) {
            newData[i] = data[(front + i) % size];
        }

        data = newData;
        front = 0;
        rear = count;
        size = newSize;
    }
}
