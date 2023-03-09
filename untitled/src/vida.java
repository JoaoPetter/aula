
import java.util.Scanner;

public class vida {
    public static void main(String args[]) {
        //  Scanner x = new Scanner (System.in); //  / System.out.println("yaya");
        char [][] tabuleiro ={{' ', ' ', ' '}, {' ',' ',' '},{' ',' ',' '}};


        while (!vitoria(tabuleiro) || !velha()) {
            exibirTabuleiro(tabuleiro);


       }


    }

    /// funções

    public static void exibirTabuleiro(char[][]tabuleiro) {

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.printf(" |");
                System.out.printf(" " + tabuleiro[i][j]);
                System.out.printf(" |");


            }
            System.out.printf("\n");
        }

    }

   /* static public boolean vitoria(char[][]tabuleiro)
    {
        return false;
    }

    static public boolean velha (char[][]tabuleiro)
    {
        return false;
    }*/

}
