import java.util.Scanner;

public class class1 {
    public static final int TOM = 0;
    public static final int KRYSS = 1;
    public static final int CIRKEL = 2;

    public static final int SPELAR = 0;
    public static final int OAVGJORT = 1;
    public static final int KRYSS_VANN = 2;
    public static final int CIRKEL_VANN = 3;

    public static final int RADER = 3, KOLUMNER = 3;
    public static int[][] bräde = new int[RADER][KOLUMNER];

    public static int nuvarandeLäge;
    public static int nuvarandeSpelare;
    public static int nuvarandeRad, nuvarandeKolumn;

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        startaSpel();
        do{
            spelarDrag(nuvarandeSpelare);
            updatera(nuvarandeSpelare, nuvarandeRad, nuvarandeKolumn);
            printBräde();

            if (nuvarandeLäge == KRYSS_VANN){
                System.out.println("Kryss vann!");
            }
            else if (nuvarandeLäge == CIRKEL_VANN){
                System.out.println("Cirkel vann!");
            }
            else if (nuvarandeLäge == OAVGJORT){
                System.out.println("Oavgjort!");
            }
            nuvarandeSpelare = (nuvarandeSpelare == KRYSS) ? CIRKEL : KRYSS;

        }
    }
}
