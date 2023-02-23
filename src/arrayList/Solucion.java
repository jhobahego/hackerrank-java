package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solucion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<List<Integer>> lineas = new ArrayList<>();

        int cantidadDeLineas = entrada.nextInt();

        for(int i = 0; i < cantidadDeLineas; i++){
            List<Integer> numeros = new ArrayList<>();
            int numerosEnLaLinea = entrada.nextInt();

            if(numerosEnLaLinea == 0){
                lineas.add(numeros);
                continue;
            }

            for(int j = 0; j < numerosEnLaLinea; j++){
                numeros.add(entrada.nextInt());
            }
            lineas.add(numeros);

        }

        int cantQuerys = entrada.nextInt();
        for(int k = 0; k < cantQuerys; k++){
            int primerIndice = entrada.nextInt();
            int segundoIndice = entrada.nextInt();

            try {
                System.out.println(lineas.get(primerIndice - 1).get(segundoIndice - 1));
            }catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
    }
}
