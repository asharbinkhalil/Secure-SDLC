package com.digicl.creationaldesignpatterns.factory.factory;

import com.digicl.creationaldesignpatterns.factory.buttons.Button;
import com.digicl.creationaldesignpatterns.factory.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}