public class DynamicStack<T> {
    private T[] data;
    private int top;
    private int size;

    public DynamicStack() {
        this.size = 2; // Tamanho inicial
        this.data = (T[]) new Object[size];
        this.top = -1;
    }

    // Método para adicionar (push) um elemento na pilha
    public void push(T item) {
        if (isFull()) {
            resize();
        }
        data[++top] = item;
    }

    // Método para remover (pop) um elemento da pilha
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha Vazia");
        }
        T item = data[top];
        data[top--] = null; // Limpa o valor do topo
        return item;
    }

    // Método para verificar se a pilha está cheia
    private boolean isFull() {
        return top == size - 1;
    }

    // Método para verificar se a pilha está vazia
    public boolean isEmpty() {
        return top == -1;
    }

    // Método para ver o número de elementos na pilha
    public int size() {
        return top + 1;
    }

    // Método para redimensionar a pilha quando cheia
    private void resize() {
        int newSize = size * 2;
        T[] newData = (T[]) new Object[newSize];

        for (int i = 0; i <= top; i++) {
            newData[i] = data[i];
        }

        data = newData;
        size = newSize;
    }
}
