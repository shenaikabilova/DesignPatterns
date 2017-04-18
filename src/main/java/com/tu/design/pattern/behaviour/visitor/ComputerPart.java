package com.tu.design.pattern.behaviour.visitor;

/**
 * @author Kamen on 30.04.16
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);

}
