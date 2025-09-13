package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User roger = new ZGeneration("Roger Smith");
        //When
        String publishIn = steven.sharePost();
        System.out.println("Steven publishes in: " + publishIn);
        publishIn = john.sharePost();
        System.out.println("John publishes in: " + publishIn);
        publishIn = roger.sharePost();
        System.out.println("Roger publishes in: " + publishIn);
        //Then
        assertEquals("Facebook", steven.sharePost());
        assertEquals("Snapchat", john.sharePost());
        assertEquals("Twitter", roger.sharePost());
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");
        //When
        steven.setSocialPublisher(new TwitterPublisher());
        //Then
        assertEquals("Twitter", steven.sharePost());
    }
}
