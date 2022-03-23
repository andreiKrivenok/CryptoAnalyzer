package krivenok.cryptoanalyzer;

import krivenok.cryptoanalyzer.controllers.MainController;
import krivenok.cryptoanalyzer.entity.Result;
import krivenok.cryptoanalyzer.exceptions.AppException;

import java.util.Arrays;

public class Application {

    private final MainController mainController;

    public Application() {
        mainController = new MainController();
    }

    public Result run(String[] args) {
        //encode text.txt encode.txt 12
        if (args.length > 0) {
            String action = args[0]; //encode
            //parameters - text.txt encode.txt 12
            String[] parameters = Arrays.copyOfRange(args, 1, args.length);

            return mainController.doAction(action, parameters);
        } else {
            throw new AppException("no args");
        }
    }

//    public static class ConsoleRunner {
//        public static void main(String[] args) {
//            //encode text.txt encode.txt 12
//            Application application = new Application();
//            Result result=application.run(args);
//            System.out.println(result);
//        }
//    }
}
