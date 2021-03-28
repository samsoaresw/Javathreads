package Valencia;

import java.util.Random;

public class Main {

public static void main(String[] args)

{

Random random = new Random();

int[] array = new int[200000000];

for (int i = 0; i < array.length; i++) {

array[i] = random.nextInt(10) + 1;

}

long startNumber = System.currentTimeMillis();

System.out.println(Sum.sum(array));

System.out.println("Single: " + (System.currentTimeMillis() - startNumber));

startNumber = System.currentTimeMillis();

System.out.println(Sum.parallelization(array));

System.out.println("Parallel: " + (System.currentTimeMillis() - startNumber));

}

}
