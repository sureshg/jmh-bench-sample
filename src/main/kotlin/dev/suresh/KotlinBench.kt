package dev.suresh

import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.infra.*
import java.util.concurrent.TimeUnit.NANOSECONDS
import java.util.concurrent.TimeUnit.SECONDS

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(NANOSECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = SECONDS)
@Fork(1)
@State(Scope.Benchmark)
open class KotlinBench {

    @Param("100", "1000", "10000")
    var size = 0

    @Benchmark
    fun test(bh: Blackhole) {
        (1..1_00).forEach {
            bh.consume(it)
        }
    }

    @Benchmark
    fun newByteArray() {
        val bytes = ByteArray(size)
        bytes[size - 1] = 10
    }
}