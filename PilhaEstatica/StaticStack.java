public class StaticStack<T>{
    private int top = -1;
    private T[] data;
    private int size;

    public StaticStack(int size){
        this.data = (T[]) new Object[size];
        this.size = size;
    }
    
    public void push(T data){
        try {
            this.data[this.top] = data;
        this.top++;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Pilha Cheia");
        }
    }
    
    public T pop(){
        if(isEmpty()){
            throw new IllegalStateException("Pilha Vazia");
        }
        this.top--;
        T dataPop = this.data[this.top];
        this.data[this.top] = null;
        return dataPop;
    }
    
    public void clear(){
        if(isEmpty()){
            System.out.println("A pilha ja esta vazia");
        }
        for (int i = this.top - 1; i >= 0; i--) {
            this.data[i] = null;
        }
        this.top = 0;
    }
    
    public boolean isFull(){
        return this.top == this.size;
    }
    
    public boolean isEmpty(){
        return this.top == -1;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        boolean first = true;
        for (T elem : this.data) {
            if (elem != null) { // Ignora elementos nulos
                if (!first) {
                    sb.append(", ");
                }
                sb.append(elem);
                first = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
}