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
        List<String> grams = valueNGrams(sentence, minSize);
        System.out.println(grams);

    }
    public static List<String> valueNGrams(String sentence, int minSize){
        String[] words =  sentence.split("\\s");
        List<String> finalValue = new ArrayList<>();
        for(String singleWord:words){
            if(singleWord.length() <= minSize){
                finalValue.add(singleWord);
            } else {
                finalValue.addAll(buildNGrams(singleWord, minSize));
            }
        }
        return finalValue;
    }
    public static List<String> buildNGrams (String word, int minSize){
            List<String> nGrams = new ArrayList<>();
            if(word.length() < minSize){
                nGrams.add(word);
            } else{
                for (int j = minSize; j <= word.length(); j++) {
                    for (int i = 0; i <= word.length() - j; i++) {
                        nGrams.add(word.substring(i, i + j));
                    }
                }
            }
            return nGrams ;
        }
    }






