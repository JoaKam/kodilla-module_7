package com.kodilla.testing.forum.statistics;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ForumStatisticsTestSuite {

    private static int testCounter = 0;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Executing test #" + testCounter);
    }

    @Test
    public void testCalculateAdvStatistics0Posts() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics newForumStatistics = new ForumStatistics(statisticsMock);
        List<String> usersList = new ArrayList<>();
        usersList.add("Adam Aaaa");
        usersList.add("Bartek Bbbb");

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        int postCount = newForumStatistics.getUsersPosts();
        double postsPerUser = newForumStatistics.getPostsPerUser();
        double commentsPerPost = newForumStatistics.getCommentsPerPost();

        //Then
        assertEquals(0, postCount);
        assertEquals(0, (int) postsPerUser);
        assertEquals(0, (int) commentsPerPost);
    }

    @Test
    public void testCalculateAdvStatistics1000Posts() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics newForumStatistics = new ForumStatistics(statisticsMock);
        List<String> usersList = new ArrayList<>();
        usersList.add("Adam Aaaa");
        usersList.add("Bartek Bbbb");

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        int postCount = newForumStatistics.getUsersPosts();
        double postsPerUser = newForumStatistics.getPostsPerUser();
        double commentsPerPost = newForumStatistics.getCommentsPerPost();

        //Then
        assertEquals(1000, postCount);
        assertTrue(postsPerUser == 500);
        assertTrue(commentsPerPost == (5 / 1000));
    }


    /*

    gdy liczba komentarzy = 0
    gdy liczba komentarzy < liczba postów
    gdy liczba komentarzy > liczba postów
    gdy liczba użytkowników = 0
    gdy liczba użytkowników = 100

     */
}
