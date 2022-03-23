package krivenok.cryptoanalyzer.commands;

import krivenok.cryptoanalyzer.entity.Result;

public interface Action {
    Result execute(String[] parameters);
}
