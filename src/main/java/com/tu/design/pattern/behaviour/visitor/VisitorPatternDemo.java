package com.tu.design.pattern.behaviour.visitor;

/**
 * @author Kamen on 30.04.16
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {
        final ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}
