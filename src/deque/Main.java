package deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> hashSet = new HashSet<>();

        int max = Integer.MIN_VALUE;
        int n = sc.nextInt();
//        String n = sc.nextLine();
        int m = sc.nextInt();


        for(int i = 0; i < n; i++){
            int input = sc.nextInt();
            deque.add(input);
            hashSet.add(input);
            if(deque.size() == m){
                if(hashSet.size() > max) max = deque.size();
                int first = deque.removeFirst();
                if(!deque.contains(first)) hashSet.remove(first);
            }
        }
        System.out.println(max);
//        int temp = m;
//        int finBucle = n.length()-m;
//        for(int i = 0; i <= finBucle; i++){
//            if(temp <= n.length()){
//                System.out.println(n.substring(i,temp));
//                temp++;
//                continue;
//            }
//        }
    }
}
