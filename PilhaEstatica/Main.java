
public class Main{
    public static void main(String []args){

        StaticStack<Integer> pilha = new StaticStack<>(5);
        
        pilha.clear();
        pilha.push(1);
        pilha.push(2);
        System.out.println(pilha.toString());
        pilha.pop();
        System.out.println(pilha.toString());
        pilha.push(4);
        pilha.push(5);
        System.out.println(pilha.toString());
        pilha.pop();
        pilha.pop();
        System.out.println(pilha.toString());
        pilha.push(6);
        pilha.push(7);
        pilha.push(8);
        System.out.println(pilha.toString());
        pilha.clear();
        System.out.println(pilha.toString());
        pilha.push(9);
        pilha.push(9);
        pilha.push(9);
        pilha.push(9);
        pilha.push(9);
        pilha.push(9);
        pilha.push(9);
        System.out.println(pilha.toString());
        
    }
}