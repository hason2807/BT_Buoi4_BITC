//bài 2  tổng của tích
public class Bai2_Calculator {
    public int calculateSumofProduct(int n) {
        int sum = 0;
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
            sum += product;
        }
        return sum;
    }

    public static void main(String[] args) {
        Bai2_Calculator calculator2 = new Bai2_Calculator();
        int sumOfProduct = calculator2.calculateSumofProduct(5);
        System.out.printf("Bieu thuc co dang: 1 + 1*2 + 1*2*3 + 1*2*3*4 + 1*2*3*4*5\n");
        System.out.printf("Tong cua tich la %d", sumOfProduct);
    }
}