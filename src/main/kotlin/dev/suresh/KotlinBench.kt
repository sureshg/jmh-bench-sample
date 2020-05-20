package dev.suresh

import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.infra.*
import java.util.concurrent.*

@Warmup(iterations = 1)
@Measurement(iterations = 1)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Fork(1)
open class KotlinBench {

    @Benchmark
    fun test(bh: Blackhole) {
        (1..1_000).forEach {
            bh.consume(it)
        }
    }
}