package explination;

import java.util.function.Predicate;

public class Main {

  public static void main(String[] args) {

    Predicate<String> p1 = new Predicate<>() {

      @Override
      public boolean test(String t) {
        return t.length() < 5;
      }

    };
    System.out.println(p1.test("apple"));
    System.out.println(p1.test("pear"));
    
    
    // same code from line 9 to line 18.

    Predicate<String> p2 = s -> s.length()< 5;
    System.out.println(p2.test("apple"));
    System.out.println(p2.test(""));

  }

}
