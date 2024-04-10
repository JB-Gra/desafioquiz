import java.util.Random;

public class DesafioQuiz {
    public static void main(String[] args) {
        int numeroSecreto = new Random().nextInt(100);
        System.out.println(numeroSecreto);
        int contadorIntentos = 0;
    }
}