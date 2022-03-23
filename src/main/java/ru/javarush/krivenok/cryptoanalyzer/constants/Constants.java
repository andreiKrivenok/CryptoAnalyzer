package ru.javarush.krivenok.cryptoanalyzer.constants;

import java.io.File;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Constants {
//    private static final String rus = "ЙЦУКЕНГШЩЗХЪЭЖДЛОРПАВЫФЯЧСМИТЬБЮ";
//    private static final String eng = "QWERTYUIOPLKJHGFDSAZXCVBNM";
//    private static final String cypher = "0123456789";
//    private static final String symbols = "☮!@#$%^&*()[]{}?.,;:'\"";
//     static   String alphabetString = rus + eng + rus.toLowerCase() + eng.toLowerCase() + cypher + symbols;

//    public static final List<Character> ALPHABET = alphabetString.chars().mapToObj(character -> (char) character).collect(Collectors.toList());

    public static final List<Character> ALPHABET = Arrays.asList('а', 'б', 'в',
            'г', 'д', 'е', 'ж', 'з', 'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у',
            'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»',
            ':', '!', '?', ' ');

    public static final String TXT_FOLDER=System.getProperty("user.dir")+
            File.separator+
            "text"+
            File.separator;
}
