package ConditionalStatementInJava;

public class Triangle {

    public void checkTriangle(float a, float b, float c) {
        if (a > 0 && b > 0 && c > 0) {
            if (a < b + c && b < a + c && c < a + b) {
                System.out.println("3 số: " + a + " , " + b + " , " + c + " tạo thành 1 tam giác");
            } else {
                System.out.println("3 số: " + a + " , " + b + " , " + c + " không tạo thành 1 tam giác");
            }
        } else {
            System.out.println("Hãy nhập vào số dương");
        }
    }

}
