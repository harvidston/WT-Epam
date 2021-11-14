package by.bsuir.task.writer.impl;

import by.bsuir.task.writer.interfaces.Writer;

public class ConsoleWriter implements Writer {

    @Override
    public void print(String s) {
        System.out.print(s);
    }

    @Override
    public void println(String s) {
        System.out.println(s);
    }
}
