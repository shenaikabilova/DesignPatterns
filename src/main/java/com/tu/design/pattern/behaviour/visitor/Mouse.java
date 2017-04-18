package com.tu.design.pattern.behaviour.visitor;

/**
 * @author Kamen on 30.04.16
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
