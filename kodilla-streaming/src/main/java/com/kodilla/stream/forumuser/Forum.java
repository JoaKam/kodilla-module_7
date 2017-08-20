package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public List<ForumUser> getUserList() {

        forumUsersList.add(new ForumUser(1, "Anna90", 'F', LocalDate.of(2010, 01, 10), 10));
        forumUsersList.add(new ForumUser(2, "Alo80", 'M', LocalDate.of(2000, 06, 10), 20));
        forumUsersList.add(new ForumUser(3, "Bartek70", 'M', LocalDate.of(1990, 04, 18), 40));
        forumUsersList.add(new ForumUser(4, "Krzyyyy", 'M', LocalDate.of(1980, 01, 6), 10));
        forumUsersList.add(new ForumUser(5, "Jonna92", 'F', LocalDate.of(1995, 01, 1), 50));
        forumUsersList.add(new ForumUser(6, "Wojtek", 'M', LocalDate.of(1980, 01, 6), 0));

        return new ArrayList<>(forumUsersList);
    }
}
