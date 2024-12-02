package exercicios.logicasimples;


public class Ex20 {
    public static void main(String[] args) {
        System.out.println(aleatorio0_100());
    }
    public static int aleatorio0_100(){
        return (int) (Math.random() * (100));
    }
}
