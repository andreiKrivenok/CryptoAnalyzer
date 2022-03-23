package ru.javarush.krivenok.cryptoanalyzer.controllers;

import ru.javarush.krivenok.cryptoanalyzer.commands.Action;
import ru.javarush.krivenok.cryptoanalyzer.entity.Result;

public class MainController {

    public Result doAction(String actionName, String[] parameters) {

        Action action = Actions.find(actionName);
        return action.execute(parameters);
    }
}
