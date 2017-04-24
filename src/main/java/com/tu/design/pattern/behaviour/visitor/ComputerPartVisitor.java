package com.tu.design.pattern.behaviour.visitor;

/**
 * @author Kamen on 30.04.16
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

}
