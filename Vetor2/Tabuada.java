import java.util.Scanner;
public class Tabuada {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int i, a[], r , n;
                final int TAM = 5;

                a = new int [TAM];

                for(i = 0; i <= 4; i++) {
                        System.out.println("Digite o número pra tabuada");
                        a[i] = in.nextInt();

                        for(n = 0; n < 11; n++) {
                                r = a[i] * n;
                    System.out.println(a[i] + " x " + n + " = " + r);

                }

                }

                in.close();
        }

}
