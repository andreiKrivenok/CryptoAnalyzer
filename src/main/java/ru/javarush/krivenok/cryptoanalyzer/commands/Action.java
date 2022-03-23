package ru.javarush.krivenok.cryptoanalyzer.commands;

import ru.javarush.krivenok.cryptoanalyzer.entity.Result;

public interface Action {
    Result execute(String[] parameters);
}
