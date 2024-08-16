
import java.util.Arrays;

public class CircularQueue<T>{
    private int top = 0;
    private int base = 0;
    private T[] data;
    private int size;

    public CircularQueue(int size){
        this.data = (T[]) new Object[size];
        this.size = size;
    }
    
    public void add(T data){
        try {
            this.data[this.top] = data;
        this.top = move(this.top);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Pilha Cheia");
        }
    }
    
    public T remove(){
        if(isEmpty()){
            throw new IllegalStateException("Pilha Vazia");
        }
        T dataPop = this.data[this.base];
        this.data[this.base] = null;
        this.base = move(this.base);
        return dataPop;
    }
    
    public void clear(){
        if(isEmpty()){
            System.out.println("A pilha ja esta vazia");
        }
        // for (int i = this.top - 1; i >= 0; i--) {
        //     this.data[i] = null;
        // }
        Arrays.fill(data, null);
        this.top = 0;
    }
    
    public boolean isFull(){
        return this.top != 0 && this.top == this.base;
        // if(){
        //     return this.top == this.size;
        // }
    }
    
    public boolean isEmpty(){
        return this.top == -1;
    }
    
    public int move(int pos){
        // if(this.top == (this.size - 1)){
        //     this.top = 0;
        // }
        // this.top++;
        return this.size - 1 ==  pos ? 0 : pos + 1 ;
    }
    @Override
    public String toString() {
        // StringBuilder sb = new StringBuilder();
        // sb.append("{");
        // for (T elem : this.data) {
        //     if(elem == null){
        //         sb.append("[ ],");
        //     }
        //     else { 
        //     sb.append("[");
        //     sb.append(elem);
        //     sb.append("],");
        //     }
        // }
        // sb.append("}");
        // return sb.toString();
        return Arrays.toString(data);
    }
    
}