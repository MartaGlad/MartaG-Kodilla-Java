package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(1,"Psowaty", 'M', LocalDate.of(1969,3,12), 0));
        usersList.add(new ForumUser(2,"Olga", 'F', LocalDate.of(1971,6,30), 4));
        usersList.add(new ForumUser(3,"Antolek", 'M', LocalDate.of(1983,2,7), 14));
        usersList.add(new ForumUser(4,"Domka", 'F', LocalDate.of(1972,4,15), 20));
        usersList.add(new ForumUser(5,"Maria", 'F', LocalDate.of(1981,11,22), 30));
        usersList.add(new ForumUser(6,"Muriel", 'F', LocalDate.of(2008,10,13), 1));
        usersList.add(new ForumUser(7,"Eustachy", 'M', LocalDate.of(1999,10,4), 0));
        usersList.add(new ForumUser(8,"Fred", 'M', LocalDate.of(1969,8,16), 8));
        usersList.add(new ForumUser(9,"Scooby", 'M', LocalDate.of(2006,3,27), 63));
        usersList.add(new ForumUser(10,"Qlot", 'M', LocalDate.of(2020,1,13), 4));
        usersList.add(new ForumUser(11,"Mysz123", 'F', LocalDate.of(1990,2,25), 8));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(usersList);
    }


}
