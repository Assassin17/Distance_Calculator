package org.sourav.project.personal.Service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sourav.project.personal.bean.ApiResponse;
import org.sourav.project.personal.bean.Request;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class DistanceTest {

    private Distance distanceUnderTest;

    @BeforeEach
    void setUp() {
        distanceUnderTest = new Distance();
    }


    @Test
    void testGetDistance_ThrowsException() {
        // Setup
        final Request request = new Request();
        request.setToken("token");
        request.setLatOrigin("latOrigin");
        request.setLongOrigin("longOrigin");
        request.setLatDest("latDest");
        request.setLongDest("longDest");

        // Run the test
        assertThrows(Exception.class, () -> distanceUnderTest.getDistance(request));
    }
}
