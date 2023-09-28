
public class Tabuada {

	public static void main(String[] args) {
		
		
	       int r;

           for (int i = 1; i <= 10; i++) {
               System.out.println("Tabuada do " + i + ":");

               	int n =1;
               
               n = 1;

               for (; n <= 10; n++) {
                   r = i * n;
                   System.out.println(i + " x " + n + " = " + r);
               }

               System.out.println();
           }
       }
   }