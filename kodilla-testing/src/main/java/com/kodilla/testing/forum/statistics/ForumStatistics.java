package com.kodilla.testing.forum.statistics;

class ForumStatistics {

    Statistics statistics;
    int usersCounter;
    int usersPosts;
    int usersComments;
    double postsPerUser;
    double commentsPerUser;
    double commentsPerPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(String forumName) {

        usersCounter = statistics.usersNames().size();
        usersPosts = statistics.postsCount();
        usersComments = statistics.commentsCount();

        if (usersCounter != 0) {
            postsPerUser = usersPosts / usersCounter;
        } else {
            postsPerUser = 0;
        }

        if (usersCounter != 0) {
            commentsPerUser = usersComments / usersCounter;
        } else {
            commentsPerUser = 0;
        }

        if (usersPosts != 0) {
            commentsPerPost = usersComments / usersPosts;
        } else {
            commentsPerPost = 0;
        }

    }

    public void ShowStatistics() {

        System.out.println("Number of users: " + usersCounter);
        System.out.println("Number of posts: " + usersPosts);
        System.out.println("Number of comments: " + usersComments);
        System.out.println("Number of posts per user: " + postsPerUser);
        System.out.println("Number of comments per user: " + commentsPerUser);
        System.out.println("Number of comments per post: " + commentsPerPost);
    }

    public int getUsersCounter() {
        return usersCounter;
    }

    public int getUsersPosts() {
        return usersPosts;
    }

    public int getUsersComments() {
        return usersComments;
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
}
