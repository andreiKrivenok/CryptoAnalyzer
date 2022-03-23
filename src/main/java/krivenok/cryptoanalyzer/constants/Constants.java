package krivenok.cryptoanalyzer.constants;

import krivenok.cryptoanalyzer.Application;
import krivenok.cryptoanalyzer.ConsoleRunner;
import krivenok.cryptoanalyzer.controllers.MainController;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constants {
//    private static final String rus = "ЙЦУКЕНГШЩЗХЪЭЖДЛОРПАВЫФЯЧСМИТЬБЮ";
//    private static final String eng = "QWERTYUIOPLKJHGFDSAZXCVBNM";
//    private static final String cypher = "0123456789";
//    private static final String symbols = "☮!@#$%^&*()[]{}?.,;:'\"";
//
//    public static String alphabetString = rus + eng + rus.toLowerCase() + eng.toLowerCase() + cypher + symbols;
//
//    public static final char[] ALPHABET = alphabetString.toCharArray();









    public static final List<Character> ALPHABET = Arrays.asList('а', 'б', 'в',
            'г', 'д', 'е', 'ж', 'з', 'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у',
            'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»',
            ':', '!', '?', ' ');

//    public static final char[] ALPHABET2 = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з',
//            'и','к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
//            'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};


    public static String TXT_FOLDER=System.getProperty("user.dir")+
            File.separator+
            "text"+
            File.separator;
}
