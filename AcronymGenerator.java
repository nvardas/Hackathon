/**
 * Program to return an acronym from a list of strings
 * @author Alex, Eva Nicova, Nathan Vardas
 * @version 13 May 2017
 */

import java.util.ArrayList;
import java.util.Scanner;
public class AcronymGenerator {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\f");
        
        System.out.println("Enter several words: (enter ! to stop)");
        System.out.println();
        
        String temp = scan.nextLine();
        while (temp.equals("!") == false) {
            s.add(temp);
            temp = scan.nextLine();
        }
        
        System.out.println();
        System.out.print(getAcronym(s));
    }
    public static String getAcronym(ArrayList<String> s) {
        String temp = "";
        
        for (int i = 0; i < s.size(); i++) {
            temp += s.get(i).substring(0, 1);
        }
        
        return temp.toUpperCase();
    }
}