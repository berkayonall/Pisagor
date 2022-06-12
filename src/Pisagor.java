import java.util.Scanner ;

public class Pisagor {
    public static void main(String[] args) {
int a , b ;
double c ;

        Scanner inp = new Scanner(System.in);
        System.out.println("A kenar uzunlugu");
        a = inp.nextInt();

        System.out.println("B kenar uzunlugu");
        b = inp.nextInt();


        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus :" + c);
    }
}
