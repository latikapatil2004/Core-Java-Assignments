/*Assignment 17: Calculate the Sum of All Numbers
Description:
Create a list of integers and calculate the sum of all elements using the Stream API.
Requirements:
Use mapToInt().
Use sum().
Display the total sum.
Input:
[10, 20, 30, 40, 50]
Expected Output:
Total Sum: 150*/

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Qs54
{
    public static void main(String[] args)
    {
        List<Integer> al = List.of(10, 20, 30, 40, 50);

        Stream<Integer> s = al.stream();

        IntStream s1 = s.mapToInt(new ToIntFunction<Integer>()
        {
            public int applyAsInt(Integer val)
            {
                return val;
            }
        });

        int result = s1.sum();

        System.out.println("Total Sum: " + result);
    }
}
