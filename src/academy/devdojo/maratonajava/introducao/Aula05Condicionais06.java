package academy.devdojo.maratonajava.introducao;

public class Aula05Condicionais06 {
    public static void main(String[] args) {
        // dado os valor de 1 a 7 se é dia util fim de semana, consdierando 1 como domingo
        byte diaDaSemana = 12;
        switch (diaDaSemana) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }
}
