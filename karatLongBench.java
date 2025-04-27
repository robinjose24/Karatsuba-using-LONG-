import java.util.Scanner;

public class karatLongBench {

    // Helper function to compute powers of 10 safely
    public static long powerOf10(int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= 10;
        }
        return result;
    }

    // Karatsuba multiplication
    public static long karatsuba(long x, long y) {
        if (x < 10 || y < 10) return x * y;

        int size = Math.max(Long.toString(x).length(), Long.toString(y).length());
        int half = size / 2;

        long pow = powerOf10(half);

        long high1 = x / pow;
        long low1 = x % pow;
        long high2 = y / pow;
        long low2 = y % pow;

        long z0 = karatsuba(low1, low2);
        long z1 = karatsuba((low1 + high1), (low2 + high2));
        long z2 = karatsuba(high1, high2);

        return (z2 * powerOf10(2 * half)) + ((z1 - z2 - z0) * pow) + z0;
    }
	
	public static long normalMulti(long x,long y){
		return x*y;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
		long result=0;
		long result2=0;

        long startTime = System.nanoTime();
		for(int i=1;i<=10;i++){
             result = karatsuba(num1, num2);
		}
        long endTime = System.nanoTime();
        double milliduration=(endTime - startTime)/10/1_000_000.0;

        long startTime2 = System.nanoTime();
		for(int i=1;i<=10;i++){
             result2 = normalMulti(num1, num2);
		}
        long endTime2 = System.nanoTime();
        double milliduration2=(endTime2 - startTime2)/10/1_000_000.0;
		System.out.println();
		
		//karatsuba multi
        System.out.println("Karatsuba Multi Result: " + result);
        System.out.println("Time taken: " + milliduration + " milliseconds");
		
		System.out.println();
		//normal multi
		System.out.println("Normal Multiply Result: " + result2);
        System.out.println("Time taken: " + milliduration2 + " milliseconds");
		
    }
}
