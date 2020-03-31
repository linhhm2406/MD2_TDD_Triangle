public class TriangleClassify {
    public static String getNameOfTriangle(int side1, int side2, int side3) {
        boolean isAEqualB = side1 == side2;
        boolean isBEqualC = side2 == side3;
        boolean isAEqualC = side1 == side3;
        boolean isASmallerThanOrEqualZero = side1 <= 0;
        boolean isBSmallerThanOrEqualZero = side2 <= 0;
        boolean isCSmallerThanOrEqualZero = side3 <= 0;
        boolean isSumOfAAndBBiggerThanC = side1 + side2 > side3;
        boolean isSumOfBAndCBiggerThanA = side2 + side3 > side1;
        boolean isSumOfAAndCBiggerThanB = side1 + side3 > side2;

        String result = "tam giac thuong";

        if (isASmallerThanOrEqualZero || isBSmallerThanOrEqualZero || isCSmallerThanOrEqualZero) {
            result = "khong phai tam giac";
        } else if (!isSumOfAAndBBiggerThanC || !isSumOfBAndCBiggerThanA || !isSumOfAAndCBiggerThanB) {
            result = "khong phai tam giac";
        } else if (isAEqualB && isBEqualC) {
            result = "tam giac deu";
        } else if (isAEqualB || isBEqualC || isAEqualC) {
            result = "tam giac can";
        }
        return result;
    }
}
