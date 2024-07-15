package org.gimenezalan.abstractFactory.checkbox.impl;

import org.gimenezalan.abstractFactory.checkbox.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Esta dibujando un checkbox Mac");
    }
}
