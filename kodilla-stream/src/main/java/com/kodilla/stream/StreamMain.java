package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import static java.util.regex.Pattern.matches;

public class StreamMain {

    public static void main(String[] args) {
       /* Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);*/

        /*System.out.println("Calculating expressions with lambdas");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 5,(a,b) -> a+b);
        expressionExecutor.executeExpression(10,5,(a,b) -> a-b);
        expressionExecutor.executeExpression(10,5,(a,b)-> a*b);
        expressionExecutor.executeExpression(10, 5, (a,b) -> a/b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAyB);*/

        /*PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Marta", (s) -> "ABC"+s+"ABC");
        poemBeautifier.beautify("Marta",  (s) -> s.toUpperCase());
        poemBeautifier.beautify("Marta", s -> {
            StringBuilder sb =  new StringBuilder();
            sb.append("*");
            for(int i = 0; i < s.length(); i++){
                sb.append(s.charAt(i));
                sb.append("*");
            }
            return sb.toString();
        });

        poemBeautifier.beautify("Marta",  (s) -> {
            StringBuilder sb =  new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                if(!(String.valueOf(s.charAt(i)).matches("[aeiouyAEIOUY]"))){
                    sb.append(s.charAt(i));
                }
            }
            return sb.toString();
        });

         */
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);



    }

}

