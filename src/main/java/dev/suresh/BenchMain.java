package dev.suresh;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;
import java.util.stream.LongStream;
import org.openjdk.jmh.annotations.*;

@Warmup(iterations = 2)
@Measurement(iterations = 2)
@BenchmarkMode(Mode.SingleShotTime)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(1)
@State(Scope.Benchmark)
public class BenchMain {

  @Param("2")
  int min;

  @Param("10")
  int max;

  @Benchmark
  public long test() {
    var primeStream =
        LongStream.rangeClosed(min, max)
            .mapToObj(BigInteger::valueOf)
            .filter(i -> i.isProbablePrime(50));
    return primeStream.count();
  }
}
