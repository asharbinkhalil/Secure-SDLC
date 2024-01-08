package com.digicl.behavioraldesignpattern.command;

import com.digicl.behavioraldesignpattern.command.editor.Editor;

public class CommandRunner {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}
