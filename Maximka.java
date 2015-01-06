
import java.math.BigDecimal;

class Maximka {
   public static <T extends Number> Float compute_sum(T a, T b) {
      return new Float(a.floatValue() + b.floatValue());
   }

   public static void main(String[] args) {
      Integer a = 1;
      Integer b = 2;
      Float af = new Float(1.0);
      Float bf = new Float(2.0);
      BigDecimal abd = new BigDecimal("1");
      BigDecimal bbd = new BigDecimal("2");

      Float sum_int     = compute_sum(a, b);
      Float sum_float   = compute_sum(af, bf);
      Float sum_big     = compute_sum(abd, bbd);

      System.out.println("sum_int: " + sum_int);
      System.out.println("sum_float: " + sum_float);
      System.out.println("sum_big: " + sum_big);
   }
}
