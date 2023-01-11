package Test;

import java.math.BigInteger;
import java.util.stream.Stream;

public class Teststream {
    public static void main(String[] args) {
//        Stream<Double> doubleStream = Stream.generate(Math::random);
        Stream<BigInteger> bigIntegerStream =Stream.iterate(BigInteger.ZERO,a->a.add(BigInteger.ONE));
        bigIntegerStream.forEach(System.out::println);
//        doubleStream.forEach(System.out::println);
    }


}
