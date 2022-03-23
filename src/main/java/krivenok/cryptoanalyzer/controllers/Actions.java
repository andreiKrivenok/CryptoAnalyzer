package krivenok.cryptoanalyzer.controllers;

import krivenok.cryptoanalyzer.commands.Action;
import krivenok.cryptoanalyzer.commands.BruteForce;
import krivenok.cryptoanalyzer.commands.Decoder;
import krivenok.cryptoanalyzer.commands.Encoder;
import krivenok.cryptoanalyzer.exceptions.AppException;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder()),
    BRUTEFORCE(new BruteForce());

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String actionName) {
        try {
            Actions value = Actions.valueOf(actionName.toUpperCase());
            return value.action;
        } catch (IllegalArgumentException e) {
            throw new AppException("not found " + actionName, e);
        }
    }
}
