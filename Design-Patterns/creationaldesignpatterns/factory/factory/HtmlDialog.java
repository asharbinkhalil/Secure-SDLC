package com.digicl.creationaldesignpatterns.factory.factory;

import com.digicl.creationaldesignpatterns.factory.buttons.Button;
import com.digicl.creationaldesignpatterns.factory.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
