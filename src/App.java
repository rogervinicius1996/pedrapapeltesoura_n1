import java.lang.Math;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner pl = new Scanner(System.in);
        Ptp ptp = new Ptp();
        for (int c = 1 ; c != 0; c = pl.nextInt()){
        System.out.println("digite 1 para PEDRA");
        System.out.println("digite 2 para TESOURA");
        System.out.println("digite 3 para PAPEL");
        int jogador = pl.nextInt(); 
        int   pc  = (int) Math.floor(Math.random()* 3) + 1;
        System.out.println(ptp.jogo(jogador, pc));
        System.out.println("digite 0 para encerrar ou outro numero para continuar");
        }
        
    

    
        }
    
}
