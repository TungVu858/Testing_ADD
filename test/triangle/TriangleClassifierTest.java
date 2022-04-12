package triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void triangle() {
        String test = TriangleClassifier.Triangle(2,2,2);
        String expected = "tam giác đều";
        assertEquals(expected,test);
    }
    @Test
    void triangle1() {
        String test = TriangleClassifier.Triangle(2,2,3);
        String expected = "tam giác cân";
        assertEquals(expected,test);
    }
    @Test
    void triangle2() {
        String test = TriangleClassifier.Triangle(3,4,5);
        String expected = "tam giác thường";
        assertEquals(expected,test);
    }
    @Test
    void triangle3() {
        String test = TriangleClassifier.Triangle(8,2,3);
        String expected = "không phải là tam giác";
        assertEquals(expected,test);
    }
    @Test
    void triangle4() {
        String test = TriangleClassifier.Triangle(-1,2,1);
        String expected = "không phải là tam giác";
        assertEquals(expected,test);
    }
    @Test
    void triangle5() {
        String test = TriangleClassifier.Triangle(0,1,1);
        String expected = "không phải là tam giác";
        assertEquals(expected,test);
    }
}