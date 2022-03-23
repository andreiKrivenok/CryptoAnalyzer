package ru.javarush.krivenok.cryptoanalyzer;

public class ConsoleRunner {

    public static void main(String[] args) {
        //encode text.txt encode.txt 3
        //decode afterEncode.txt afterDecode.txt 3
        //bruteForce afterEncode.txt afterDecodeBF.txt 0

        Application application = new Application();
        ru.javarush.krivenok.cryptoanalyzer.entity.Result result = application.run(args);
        System.out.println(result);
    }
}

