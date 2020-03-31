import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifyTest {

    @Test
    @DisplayName("Test Tam giac deu")
    void getEquilateralTriangle() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "tam giac deu";
        String actual = TriangleClassify.getNameOfTriangle(a,b,c);

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test Tam giac can 1")
    void getIsoscelesTriangle1() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "tam giac can";
        String actual = TriangleClassify.getNameOfTriangle(a,b,c);

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test Tam giac can 2")
    void getIsoscelesTriangle2() {
        int a = 3;
        int b = 2;
        int c = 2;
        String expected = "tam giac can";
        String actual = TriangleClassify.getNameOfTriangle(a,b,c);

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test Tam giac can 3")
    void getIsoscelesTriangle3() {
        int a = 2;
        int b = 3;
        int c = 2;
        String expected = "tam giac can";
        String actual = TriangleClassify.getNameOfTriangle(a,b,c);

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test Khong phai tam giac 1")
    void getNotATriangle1() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "khong phai tam giac";
        String actual = TriangleClassify.getNameOfTriangle(a,b,c);

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test Khong phai tam giac 2")
    void getNotATriangle2() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "khong phai tam giac";
        String actual = TriangleClassify.getNameOfTriangle(a,b,c);

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test Khong phai tam giac 3")
    void getNotATriangle3() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "khong phai tam giac";
        String actual = TriangleClassify.getNameOfTriangle(a,b,c);

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test tam giac thuong")
    void getNormalTriangle() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "tam giac thuong";
        String actual = TriangleClassify.getNameOfTriangle(a,b,c);

        assertEquals(expected,actual);
    }
}