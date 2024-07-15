package org.gimenezalan.abstractFactory.checkbox.impl;

import org.gimenezalan.abstractFactory.checkbox.Checkbox;

public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Esta dibujando un checkbox Windows");
    }
}
