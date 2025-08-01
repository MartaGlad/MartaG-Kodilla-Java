package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;


@DisplayName("Forum Test Suite")
public class ForumTestSuite {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Test Suite: end");
    }

    @BeforeEach
    public void before() {
        System.out.println("\nTest Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end\n");
    }



    @DisplayName(
            "When created SimpleUser with realName, " +
                    "then getRealName should return real user name"
    )

    @Test
    void testCaseRealName() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals("John Smith", result);
    }


    @DisplayName(
            "When created SimpleUser with userName, " +
                    "then getUsername should return correct name"
    )

    @Test
    void testCaseUserName() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        String expectedResult = "theForumUser";
        //When
        String result = simpleUser.getUsername();
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
