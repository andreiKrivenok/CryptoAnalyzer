package krivenok.cryptoanalyzer;

import krivenok.cryptoanalyzer.Application;
import krivenok.cryptoanalyzer.constants.Constants;

public class ConsoleRunner {
    public static void main(String[] args) {
        //encode text.txt encode.txt 12
        Application application = new Application();
        krivenok.cryptoanalyzer.entity.Result result=application.run(args);
        System.out.println(result);

    }
}

