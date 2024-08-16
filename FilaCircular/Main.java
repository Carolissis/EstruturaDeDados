
public class Main{
    public static void main(String []args){

        CircularQueue<Integer> filaCircular = new CircularQueue<>(3);

        filaCircular.add(1);
        System.out.println(filaCircular);
        filaCircular.remove();
        System.out.println(filaCircular);
        filaCircular.add(2);
        filaCircular.add(3);
        System.out.println(filaCircular);
        filaCircular.add(4);
        System.out.println(filaCircular);
        filaCircular.remove();
        filaCircular.remove();
        System.out.println(filaCircular);
        filaCircular.add(5);
        System.out.println(filaCircular);
        filaCircular.remove();
        System.out.println(filaCircular);
    }
}