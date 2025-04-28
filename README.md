# Karatsuba Multiplication in Java
This project implements Karatsuba multiplication and compares it with normal multiplication (x * y) using Java.

# There are two versions:

## karatLong.java — Basic version without benchmarking (single execution timing).

## karatLongBench.java — Benchmarking version that averages the time over multiple runs for more accurate measurement.

# File Name	Description
karatLong.java	Measures and compares Karatsuba and normal multiplication with a single execution.
karatLongBench.java	Repeats multiplication 10 times and averages the execution time for better accuracy (benchmarking).
# 🛠 How It Works
Both versions:

Take two long integers as input from the user.

Perform:

Karatsuba Multiplication (recursive divide-and-conquer algorithm)

Normal Multiplication (using * operator)

Measure and print the time taken by each method.

In the benchmarking version (karatLongBench.java):

Each multiplication is repeated 10 times.

Total time is divided by 10 to get the average execution time per operation.

# 🚀 How to Run
Clone this repository or copy the files locally.

Compile the Java files:

javac karatLong.java
javac karatLongBench.java
Run them:

java karatLong
or

java karatLongBench
Enter two numbers (UPTO 8 DIGITS Since it is implemented using LONG)

## 📈 Example Output
## Without Benchmarking (karatLong.java):

Input:
1234
5678

Karatsuba Multi Result: 7006652
Time taken: 0.015 milliseconds

Normal Multiply Result: 7006652
Time taken: 0.003 milliseconds
//-----------------------------------------------------
## With Benchmarking (karatLongBench.java):

Input:
1234
5678

Karatsuba Multi Result: 7006652
Time taken: 0.010 milliseconds (average over 10 runs)

Normal Multiply Result: 7006652
Time taken: 0.002 milliseconds (average over 10 runs)
//------------------------------------------------------
## 📚 What I Learned
Implemented Karatsuba multiplication from scratch.

Learned how recursive multiplication reduces time complexity compared to naive multiplication for large numbers.

Improved timing accuracy using benchmarking (repeating operations and averaging execution times).

## 📌 Future Improvements
Extend to very large numbers (BigInteger version).

Compare against other fast multiplication algorithms like Toom-Cook.

Create a simple GUI for better user interaction.

## 🤝 Contributions
Suggestions and improvements are welcome!
