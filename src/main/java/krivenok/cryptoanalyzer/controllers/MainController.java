package krivenok.cryptoanalyzer.controllers;

import krivenok.cryptoanalyzer.commands.Action;
import krivenok.cryptoanalyzer.entity.Result;

public class MainController {

    public Result doAction(String actionName, String[] parameters) {
        //action == encode
        //parameters = [text.txt,encode.txt,12]
        Action action = Actions.find(actionName);
        return action.execute(parameters);
    }
}
