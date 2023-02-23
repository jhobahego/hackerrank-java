package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class StackSolucion {

    public static boolean esValida(String input){
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '('){
                pila.push('(');
            }else if(input.charAt(i) == '{'){
                pila.push('{');
            }else if(input.charAt(i) == '['){
                pila.push('[');

            }else if(input.charAt(i) == ')'){
                if (pila.pop() != ('(')) {
                    return false;
                }
            }else if(input.charAt(i) == '}') {
                if (pila.pop() != ('{')) {
                    return false;
                }
            }else if(input.charAt(i) == ']') {
                if (pila.pop() != ('[')) {
                    return false;
                }
            }

        }
        return pila.isEmpty();


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(esValida(input));
        }

    }
}
