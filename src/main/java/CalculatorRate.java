import java.io.InputStream;
import java.util.Scanner;

public class CalculatorRate {
    public static float calcul_rate(int type_loan, int price) {
        int price_limit = 2000000000;
        int price_trafer_rate = 900000000;

        float rate;

        if (type_loan == 1) {
            if(0 <= price && price < price_trafer_rate) {
                return rate = 3;
            } else if (price == price_trafer_rate) {
                return rate = 3.5F;
            } else if (price_trafer_rate < price && price <= price_limit) {
                return rate = 4.5F;
            } else {
                System.out.println("Số tiền bạn muốn vay không hợp lệ");
                throw new IllegalArgumentException("Số tiền muốn vay phải lớn hơn 0 và nhỏ hơn 2 tỉ");
            }
        } else if (type_loan == 2) {
            if(0 <= price && price < price_trafer_rate) {
                return rate = 4;
            } else if (price == price_trafer_rate) {
                return rate = 5;
            } else if (price_trafer_rate < price && price <= price_limit) {
                return rate = 7;
            } else {
                System.out.println("Số tiền bạn muốn vay không hợp lệ");
                throw new IllegalArgumentException("Số tiền muốn vay phải lớn hơn 0 và nhỏ hơn 2 tỉ");
            }
        } else {
            System.out.println("Bạn đã nhập sai mục đích vay tiền");
            throw new IllegalArgumentException("Bạn đã nhập sai mục đích vay tiền");
        }
    }

    public static void main(String[] args) {
        int price;
        int type_loan;

        System.out.println("Bạn muốn vay tiền để làm gì ?");
        System.out.println("Chọn 1: Nếu bạn muốn vay để mua nhà ?");
        System.out.println("Chọn 2: Nếu bạn muốn vay để mua xe ?");

        InputStream stream = System.in;
        Scanner scanner = new Scanner(stream);

        type_loan = scanner.nextInt();

        System.out.println("Nhập số tiền bạn muốn vay");
        price = scanner.nextInt();

        float result = calcul_rate(type_loan, price);

        System.out.println("Lãi suất của bạn là: " + result +"%");
    }
}
