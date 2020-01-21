package com.artem.tasks.anagram;
import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.addAll;

/**
 * Created by User on 13.01.2020.
 */
public class Anagram {
    public static void main(String[] args) {

        int minSize = 3;
        String line = "А попробуй эти строки разбить на слова";
        String[] str = breakLine(line);
        List<String> finish = new ArrayList<>();
        for(String words:str){
            if(words.length() <= minSize){
                System.out.println(finish.add(words));
            } else {
                finish.addAll(buildNGrams(words, minSize));
            }
        }
        System.out.println(finish);
    }
    public static List<String> buildNGrams(String words, int minSize){
            List<String> nGrams = new ArrayList<>();
            for (int j = minSize; j <= words.length(); j++) {
                for (int i = 0; i <= words.length() - j; i++) {
                    nGrams.add(words.substring(i, i + j));
                }
            }
            return nGrams ;
        }
    public static String[] breakLine(String line){
        String[] words =  line.split("\\s");

        return words;
    }
    }

    /*public static List<String> buildNGrams(String word, int minSize){
        List<String> nGrams = new ArrayList<>();

        for (int k = minSize; k < word.length() + 1; k ++){
            for (int j = k; j <= word.length(); j++){
                for(int i = j - k; i < j - (k-1); i ++){
                    nGrams.add(word.substring(i,j));
                }
            }
        }
        return nGrams ;
    }*/




