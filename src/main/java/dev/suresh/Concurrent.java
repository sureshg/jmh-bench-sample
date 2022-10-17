package dev.suresh;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.*;

@Warmup(iterations = 2)
@Measurement(iterations = 2)
@BenchmarkMode(Mode.SingleShotTime)
@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(1)
@State(Scope.Benchmark)
public class Concurrent {

  public static void main(String[] args) {
    System.out.println("Help");
  }

  @Benchmark
  public long test() {
    // Bounded queue, uses an array to store its elements and a single lock for both reading and
    // writing.
    Queue<String> abq = new ArrayBlockingQueue<>(10);
    abq.offer("");

    // Bounded queue, uses a linked list to store its elements and two locks. One lock for reading
    // and one lock for writing.
    Queue<String> lbq = new LinkedBlockingQueue<>(10);
    lbq.offer("");

    Queue<String> clq = new ConcurrentLinkedQueue<>();

    return 1;
  }
}
