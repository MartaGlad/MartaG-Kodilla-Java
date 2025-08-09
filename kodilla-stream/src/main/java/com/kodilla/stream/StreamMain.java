package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Locale.filter;
import static java.util.Locale.getDefault;
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
        /*System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/


       /* People.getList().stream()
                .forEach(System.out::println);*/

       /* People.getList().stream()
                .map(s-> s.toUpperCase())
                .forEach(System.out::println);*/


        /*People.getList().stream()
                .map(String::toUpperCase)
                .forEach(s -> System.out.println(s));*/

        /*People.getList().stream()
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);*/

       /* People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(" ")+2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);*/

        /*BookDirectory bookDirectory = new BookDirectory();
        bookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);*/

        /*BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements : " + theResultListOfBooks.size());
        theResultListOfBooks.stream().
                forEach(System.out::println);*/

        /*BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements:" + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/

        /*BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(", \n"," <<", ">>"));

        System.out.println(theResultStringOfBooks);
*/

        Forum forum = new Forum();
        Map<Integer, ForumUser> forumUsersMap = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> Period.between(user.getBirthDate(), LocalDate.now()).getYears() > 20)
                .filter(user -> user.getPostsNumber() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        System.out.println("# elements: " + forumUsersMap.size());

        forumUsersMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }

}

