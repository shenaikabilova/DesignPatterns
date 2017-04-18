package com.tu.design.pattern.kivanov.behaviour.interpreter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kamen on 30.04.16
 */
public class InterpreterPatternDemo {


    private static final Logger logger = LoggerFactory.getLogger(InterpreterPatternDemo.class);


    //Rule: Robert and John are male
    public static Expression getMaleExpression() {
        final Expression robert = new TerminalExpression("Robert");
        final Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //Rule: Julie is a married women
    public static Expression getMarriedWomanExpression() {
        final Expression julie = new TerminalExpression("Julie");
        final Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        final Expression isMale = getMaleExpression();
        final Expression isMarriedWoman = getMarriedWomanExpression();

        logger.error("John is male? {}", isMale.interpret("John"));
        logger.error("Julie is a married women? {}", isMarriedWoman.interpret("Married Julie"));
    }

}
