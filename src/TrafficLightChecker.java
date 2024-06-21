import java.util.Scanner;
import java.util.Random;
public class TrafficLightChecker {
    public static void main(String args[]) 
    {
        Scanner entrada = new Scanner(System.in);
        Random nRandom = new Random();
        System.out.println("Insira a cor atual do semaforo");
        byte corAtu = entrada.nextByte();
        String semaforoCor = null;
        switch(corAtu)
        {
            case 1 : semaforoCor =  "Verde";
            break;
            case 2 : semaforoCor = "Amarelo";
            break;
            case 3 : semaforoCor = "Vermelho";
            break;
            
        }
        System.out.println(corAtu >3 ? "Cor invalida" : "A proxima cor e "+semaforoCor);

        
    }

}
