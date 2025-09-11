package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    void testGetLastLog() {
        //Given
        logger = logger.INSTANCE; /*new Logger()*/;
        //When
        logger.log("log1");
        String lastLog = logger.getLastLog();
        //Then
        assertEquals("log1", lastLog);
    }
}
