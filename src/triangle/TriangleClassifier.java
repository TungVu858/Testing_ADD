package triangle;

public class TriangleClassifier {

    public static String Triangle(double a, double b, double c) {
        boolean check = false;
        boolean isTriangle = a + b > c && b + c > a && a + c > b;
        boolean isIsoscelesTriangle = a == b || a == c || b == c ;
        boolean isEquilateralTriangle = a == c && b == c ;
//        if (isEquilateralTriangle) {
//            return "tam giác đều";
//        }
//        else if (isIsoscelesTriangle){
//            return "tam giác cân";
//        }
//        else if (isTriangle){
//            return "tam giác thường";
//        }
//        else {
//            return "không phải là tam giác";
//        }
        if (isTriangle){
            check = true;
            if (isEquilateralTriangle){
                return "tam giác đều";
            }
            else if (isIsoscelesTriangle){
                return "tam giác cân";
            }
        }
        if (check){
            return "tam giác thường";
        }
        else {
            return "không phải là tam giác";
        }
    }
}
