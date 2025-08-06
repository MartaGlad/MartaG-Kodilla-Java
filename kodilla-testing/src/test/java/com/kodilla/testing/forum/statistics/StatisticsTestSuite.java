package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;
    private static int testCounter = 0;

    private List<String> generateListOfNUsers(int n) {
        List<String> resultList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String s = new String("User" + n);
            resultList.add(s);
        }
        return resultList;
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Test Suite: begin\n");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Test Suite: end\n");
    }

    @BeforeEach
    void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void testCalculateAdvStatisticsWhenPostsCount0() {
        //Given
        StatisticsCounter counter = new StatisticsCounter();
        when(statisticsMock.usersNames()).thenReturn(Arrays.asList("User1", "User2", "User3", "User4", "User5"));
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(15);
        //When
        counter.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(5, counter.getUsersCount());
        assertEquals(0, counter.getPostsCount());
        assertEquals(15,counter.getCommentsCount());
        assertEquals(0, counter.getPostsPerUser());
        assertEquals(3, counter.getCommentsPerUser());
        assertEquals(0, counter.getCommentsPerPost());

    }


    @Test
    void testCalculateAdvStatisticsWhenPostsCount1000() {
        StatisticsCounter counter = new StatisticsCounter();
        when(statisticsMock.usersNames()).thenReturn(Arrays.asList("User1", "User2", "User3", "User4", "User5"));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(15);
        //When
        counter.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(5, counter.getUsersCount());
        assertEquals(1000, counter.getPostsCount());
        assertEquals(15, counter.getCommentsCount());
        assertEquals(200, counter.getPostsPerUser());
        assertEquals(3, counter.getCommentsPerUser());
        assertEquals(0.015, counter.getCommentsPerPost());
    }


    @Test
    void testCalculateAdvStatisticsWhenComments0() {
        StatisticsCounter counter = new StatisticsCounter();
        when(statisticsMock.usersNames()).thenReturn(Arrays.asList("User1", "User2", "User3", "User4", "User5"));
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        counter.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(5, counter.getUsersCount());
        assertEquals(20, counter.getPostsCount());
        assertEquals(0, counter.getCommentsCount());
        assertEquals(4, counter.getPostsPerUser());
        assertEquals(0, counter.getCommentsPerUser());
        assertEquals(0, counter.getCommentsPerPost());
    }


    @Test
    void testCalculateAdvStatisticsWhenCommentsLessThanPosts() {
        StatisticsCounter counter = new StatisticsCounter();
        when(statisticsMock.usersNames()).thenReturn(Arrays.asList("User1", "User2", "User3", "User4", "User5"));
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(15);
        //When
        counter.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(5, counter.getUsersCount());
        assertEquals(20, counter.getPostsCount());
        assertEquals(15, counter.getCommentsCount());
        assertEquals(4, counter.getPostsPerUser());
        assertEquals(3, counter.getCommentsPerUser());
        assertEquals(0.75, counter.getCommentsPerPost());
    }


    @Test
    void testCalculateAdvStatisticsWhenCommentMoreThanPosts() {
        StatisticsCounter counter = new StatisticsCounter();
        when(statisticsMock.usersNames()).thenReturn(Arrays.asList("User1", "User2", "User3", "User4", "User5"));
        when(statisticsMock.postsCount()).thenReturn(15);
        when(statisticsMock.commentsCount()).thenReturn(20);
        //When
        counter.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(5, counter.getUsersCount());
        assertEquals(15, counter.getPostsCount());
        assertEquals(20, counter.getCommentsCount());
        assertEquals(3, counter.getPostsPerUser());
        assertEquals(4, counter.getCommentsPerUser());
        assertEquals(1.3333333333333333, counter.getCommentsPerPost());
    }


    @Test
    void testCalculateAdvStatisticsWhenUsersCount0() {
        StatisticsCounter counter = new StatisticsCounter();
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());
        when(statisticsMock.postsCount()).thenReturn(15);
        when(statisticsMock.commentsCount()).thenReturn(20);
        //When
        counter.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, counter.getUsersCount());
        assertEquals(15, counter.getPostsCount());
        assertEquals(20, counter.getCommentsCount());
        assertEquals(0, counter.getPostsPerUser());
        assertEquals(0, counter.getCommentsPerUser());
        assertEquals(1.3333333333333333, counter.getCommentsPerPost());
    }


    @Test
    void testCalculateAdvStatisticsWhenUsersCount100() {
        StatisticsCounter counter = new StatisticsCounter();
        when(statisticsMock.usersNames()).thenReturn(generateListOfNUsers(100));
        when(statisticsMock.postsCount()).thenReturn(15);
        when(statisticsMock.commentsCount()).thenReturn(20);
        //When
        counter.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, counter.getUsersCount());
        assertEquals(15, counter.getPostsCount());
        assertEquals(20, counter.getCommentsCount());
        assertEquals(0.15, counter.getPostsPerUser());
        assertEquals(0.2, counter.getCommentsPerUser());
        assertEquals(1.3333333333333333, counter.getCommentsPerPost());
    }
}
