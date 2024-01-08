package com.digicl.behavioraldesignpattern.command.commands;

import com.digicl.behavioraldesignpattern.command.editor.Editor;

public class CopyCommand extends Command{
    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}