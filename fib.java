// Пишем алгоритм поиска нужного числа последовательности Фибоначчи.
// 2. Считаем, что 1 и 2 значения последовательности равны 1.

public class fib {
 /**
 * @param n
 * последовательность фибоначи
 * @return
 */
public static Integer fib(Integer n) {
    if (n == 1 || n == 2)return 1;
    return fib(n - 1 ) + fib(n - 2);

 }  
 public static void main(String[] args) {
    int n = 10;
    System.out.println(fib(n));
 } 
}
// O(2^n) 
// работа алгоритма основана на переборе всех чисел от n до 1
// при этом для каждого значения (кроме первых двух, ими можно пренебречь) выполняется 2*fib(1) операций
// для fib(2) = fib(fib(1)+fib(1)),  для fib(3) = fib(fib(fib(1)+fib(1)) + fib(fib(1)+fib(1))), ...fib(n) -> 2^n