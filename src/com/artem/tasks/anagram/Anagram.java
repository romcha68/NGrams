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
        String sentence = "А попробуй эти строки разбить на слова";
        List<String> grams = buildNGrams(sentence, minSize);
        System.out.println(grams);

    }
    public static List<String> buildNGrams(String words, int minSize){
        String[] word = breakLine(words);
        List<String> finalValue = new ArrayList<>();
        for(String singleWord:word){
            if(singleWord.length() <= minSize){
                finalValue.add(singleWord);
            } else {
                finalValue.addAll(valueNGrams(singleWord, minSize));
            }
        }
        return finalValue;
    }
    public static List<String> valueNGrams (String sentence, int minSize){
            List<String> nGrams = new ArrayList<>();
            for (int j = minSize; j <= sentence.length(); j++) {
                for (int i = 0; i <= sentence.length() - j; i++) {
                    nGrams.add(sentence.substring(i, i + j));
                }
            }
            return nGrams ;
        }
    public static String[] breakLine(String sentence){
        String[] words =  sentence.split("\\s");

        return words;
    }
    }






