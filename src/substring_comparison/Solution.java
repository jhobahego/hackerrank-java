package substring_comparison;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.nextLine();
        int m = in.nextInt();

        String largest = "";
        String smallest = "";
        int temp = m;
        int finBucle = n.length()-m;
        for(int i = 0; i <= finBucle; i++){
            if(temp <= n.length()){
                if((largest.length() == 0) && (smallest.length() == 0)){
                    largest = n.substring(i, temp);
                    smallest = n.substring(i, temp);
                }else if(n.substring(i, temp).compareTo(largest) > 0){
                    largest = n.substring(i, temp);
                }else if(n.substring(i, temp).compareTo(smallest) < 0){
                    smallest = n.substring(i, temp);
                }
                temp++;
            }
        }

        System.out.println("Smallest: "+smallest +"\n Largest: "+largest);
    }
}
