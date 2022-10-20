package com.company;

import java.util.ArrayList;

public class mayank {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("nalla");
        words.add("idiot");
        words.add("stupid");

        String input = "mayank nalla aur idiot aur stupid hai";

        String ans=input;
        for (String i: words) {
            int length = i.length();
            StringBuilder stars = new StringBuilder();
            stars.append("*".repeat(length));

            ans = ans.replace(i,stars);
        }
        System.out.println(ans);
    }
}
