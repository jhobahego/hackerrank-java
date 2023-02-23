package list;

import java.util.ArrayList;
import java.util.Scanner;

public class Solucion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        ArrayList<Integer> input = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            input.add(entrada.nextInt());
        }

        int consultas = entrada.nextInt();

        while(consultas-- > 0){
            entrada.nextLine();// consume la linea dejada por el el metodo nextInt() y apunta hacia la siguiente linea
            String accion = entrada.nextLine();
            if(accion.equals("Insert")){
                int indice = entrada.nextInt();
                int valor = entrada.nextInt();
                input.add(indice,valor);
            }else if(accion.equals("Delete")){
                input.remove(entrada.nextInt());
            }
        }

        for (Integer integer : input) {
            System.out.print(integer + " ");
        }
    }

}
