package edu.cmn.deepdive;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Lottery {

  public static void main(String[] args) {
    int poolSize = Integer.parseInt(args[0]);
    int drawSize = Integer.parseInt(args[1]);
    Random rng = new SecureRandom();
    Shuffler s = new Shuffler(rng);
    int[] pool = new int[poolSize];
    for (int i = 0; i < poolSize; i++) {
      pool[i] = i +1;
    }
    int[] sample = s.draw(pool, drawSize);
    Arrays.sort(sample);
    System.out.println(Arrays.toString(sample));
  }

}
