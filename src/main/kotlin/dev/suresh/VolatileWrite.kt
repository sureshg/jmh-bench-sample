package dev.suresh

import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.infra.*
import java.util.concurrent.*

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 1, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 1, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
@State(Scope.Benchmark)
open class VolatileWrite {

  @Param("10") var tokens = 0L

  @Volatile var vv = 0

  @Benchmark
  fun incrVolatile(): Int {
    Blackhole.consumeCPU(tokens)
    return vv++
  }
}
