package com.company.Lec20;

import java.util.HashMap;
import java.util.Map;

public class maps {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("apple","sweet red fruit");
        map.put("mango","king of fruits");
        map.put("orange","yum yum");
        System.out.println(map.toString());
//        System.out.println(map.get("apple"));
        System.out.println(map.keySet());
        for (String fruit : map.keySet()  ) {
            System.out.println(fruit);
        }
        for (String values :map.values()) {
            System.out.println(values);
        }

        Map<Character,Integer> freqstr = find("Hello");
        freqstr.putIfAbsent('s',2);
        System.out.println(freqstr);

        Map<Character,Integer> vowel= vowels("Hello");
        System.out.println(vowel);

    }

    public static Map<Character,Integer> find(String line)
    {
        Map<Character,Integer> freq = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) + 1);
            }
            else {
                freq.put(ch,1);
            }
        }
        return freq;
    }

    public static Map<Character,Integer> vowels(String line)
    {
        Map<Character,Integer> freq = new HashMap<>();
        freq.put('a',0);
        freq.put('e',0);
        freq.put('i',0);
        freq.put('o',0);
        freq.put('u',0);

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) + 1);
            }
        }
        return freq;
    }
}
