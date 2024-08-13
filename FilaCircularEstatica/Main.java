
public class Main{
    public static void main(String []args){

        StaticQueue<Integer> filaCircular = new StaticQueue<>(7);

        filaCircular.add(1);
        filaCircular.add(2);
        filaCircular.add(3);
        System.out.println(filaCircular.toString());
        filaCircular.remove();
        System.out.println(filaCircular.toString());
        filaCircular.remove();
        System.out.println(filaCircular.toString());
        filaCircular.add(4);
        filaCircular.add(5);
        System.out.println(filaCircular.toString());
        filaCircular.remove();
        System.out.println(filaCircular.toString());
        filaCircular.add(6);
        filaCircular.add(7);
        System.out.println(filaCircular.toString());
        filaCircular.remove();
        System.out.println(filaCircular.toString());
        filaCircular.remove();
        System.out.println(filaCircular.toString());
        filaCircular.remove();
        System.out.println(filaCircular.toString());
    }
}