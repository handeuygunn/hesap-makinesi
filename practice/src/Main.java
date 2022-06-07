import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int n1, n2, select;

        Scanner girdi = new Scanner(System.in);
        System.out.println("Ilk sayiyi giriniz:");
        n1 = girdi.nextInt();
        System.out.println("Ikinci sayiyi giriniz:");
        n2 = girdi.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz:");
        select = girdi.nextInt();
        int sonuc;


        switch ( select) {



            case 1:
                sonuc = n1 +n2 ;
                System.out.println("Sonuc:");
                System.out.println(sonuc);
                break;

            case 2:
                sonuc = n1 -n2 ;
                System.out.println("Sonuc:");
                System.out.println(sonuc);
                break;

            case 3:
                sonuc = n1 *n2 ;
                System.out.println("Sonuc:");
                System.out.println(sonuc);
                break;

            case 4:
                sonuc = n1/n2 ;
                System.out.println("Sonuc:");
                System.out.println(sonuc);
                break;

            default:
                System.out.println("Yanlis komut girdiniz:");

        }


    }
}
