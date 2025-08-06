package com.kodilla.testing.forum.statistics;


public class StatisticsCounter {
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames() != null ? statistics.usersNames().size() : 0;
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        postsPerUser = (usersCount == 0) ? 0 : (double) postsCount / usersCount;
        commentsPerUser = (usersCount == 0) ? 0 : (double) commentsCount / usersCount;
        commentsPerPost = (postsCount == 0) ? 0 : (double) commentsCount / postsCount;

    }

    public void showStatistics(){
        System.out.println("Liczba użytkowników: "+ usersCount);
        System.out.println("Liczba postów: "+ postsCount);
        System.out.println("Liczba komentarzy: "+ commentsCount);
        System.out.println("Średnią liczba postów na użytkownika: "+ postsPerUser);
        System.out.println("Średnia liczba komentarzy na użytkownika: "+ commentsPerUser);
        System.out.println("Średnia liczba komentarzy na post: "+ commentsPerPost);

    }
}
