package by.itstep.javatraining.revision.task;

/*	Task 01. The same Numbers [совпадающие числа]
 *
 *	Даны четыре целых числа. Определите, сколько из них совпадающих.
 *	Если числа не совпадают, то необходимо возвратить ноль.
 *
 *	Формат входных данных [input]
 *	На вход даётся четыре целых числа в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	Возвратите количество совпадающих чисел или ноль, если таких чисел нет.
 *
 *	[ input 1]: 7 7 7 7
 *	[output 1]: 4
 *
 *	[ input 2]: 7 7 7 8
 *	[output 2]: 3
 *
 *	[ input 3]: 7 7 8 9
 *	[output 3]: 2
 *
 *	[ input 4]: 6 7 8 9
 *	[output 4]: 0
 */

public class Task01 {
    public static int task01(int a, int b, int c, int d) {
        boolean ab = (a == b);
        boolean ac = (a == c);
        boolean ad = (a == d);
        boolean bc = (b == c);
        boolean bd = (b == d);
        boolean cd = (c == d);

        return (ab || ac || ad || bc || bd || cd?
                (ab && ac || ab && ad || ac && ad || bc && bd)?
                        (ab && bc && cd)?4:3:2:0 );
    }
}