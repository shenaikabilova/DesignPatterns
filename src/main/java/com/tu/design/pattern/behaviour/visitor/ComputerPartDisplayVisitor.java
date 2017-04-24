package com.tu.design.pattern.behaviour.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kamen on 30.04.16
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    private static final Logger logger = LoggerFactory.getLogger(ComputerPartDisplayVisitor.class);

    @Override
    public void visit(Computer computer) {
        logger.error("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        logger.error("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        logger.error("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        logger.error("Displaying Monitor.");
    }
}
