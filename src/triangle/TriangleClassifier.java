package triangle;

public class TriangleClassifier {

    public static String Triangle(double a, double b, double c) {
        boolean isTriangle = a + b > c && b + c > a && a + c > b;
        boolean isIsoscelesTriangle = a == b || a == c || b == c && isTriangle;
        boolean isEquilateralTriangle = a == c && b == c &&isTriangle ;
        if (isEquilateralTriangle) {
            return "tam giác đều";
        }
        else if (isIsoscelesTriangle){
            return "tam giác cân";
        }
        else if (isTriangle){
            return "tam giác thường";
        }
        else {
            return "không phải là tam giác";
        }
    }
}
