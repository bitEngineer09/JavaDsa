package Lectures._4_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class inputArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> List = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            List.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            List.get(i).add(sc.nextInt());
        }
        System.out.println(List);
    }
}
