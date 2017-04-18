package com.tu.design.pattern.kivanov.behaviour.visitor;

/**
 * @author Kamen on 30.04.16
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);

}
