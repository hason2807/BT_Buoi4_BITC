//   bài 3 tìm thừa số nguyên tố 
public class Bai3_Calculator {
    public void printPrimeFactors(int n) {
        System.out.print("Cac thua so nguyen to cua " + n + " la: ");
        while (n % 2 == 0) {
            System.out.print("2 ");
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 2) {
            System.out.print(n);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Bai3_Calculator calculator3 = new Bai3_Calculator();
        calculator3.printPrimeFactors(12);
        calculator3.printPrimeFactors(35);
        calculator3.printPrimeFactors(86);
    }  
}
