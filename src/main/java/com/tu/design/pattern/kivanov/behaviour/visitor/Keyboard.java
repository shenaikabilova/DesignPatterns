package com.tu.design.pattern.kivanov.behaviour.visitor;

/**
 * @author Kamen on 30.04.16
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
