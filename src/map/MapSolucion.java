package map;

import java.util.HashMap;
import java.util.Scanner;

public class MapSolucion {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();

        HashMap<String, Integer> libreta = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            libreta.put(name, phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(!libreta.containsKey(s)) {
                System.out.println("Not found");
            }else{
                System.out.println(s + "=" +libreta.get(s));
            }
        }

    }
}
