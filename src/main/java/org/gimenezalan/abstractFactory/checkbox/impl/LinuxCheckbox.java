package org.gimenezalan.abstractFactory.checkbox.impl;

import org.gimenezalan.abstractFactory.checkbox.Checkbox;

public class LinuxCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Esta dibujando un checkbox Linux");
    }
}
