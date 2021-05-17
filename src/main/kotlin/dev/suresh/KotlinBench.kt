package dev.suresh

import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.infra.*
import java.util.concurrent.TimeUnit.NANOSECONDS
import java.util.concurrent.TimeUnit.SECONDS
import kotlin.math.*

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(NANOSECONDS)
@Warmup(iterations = 3, time = 1, timeUnit = SECONDS)
@Measurement(iterations = 3, time = 1, timeUnit = SECONDS)
@Fork(1)
@State(Scope.Benchmark)
open class KotlinBench {

    @Param("100", "1000", "10000")
    var size = 0

    private val x = Math.PI

    /**
     * Use explicit [Blackhole] objects, and sink the values there.
     * (Background: [Blackhole] is just another @State object, bundled with JMH).
     */
    @Benchmark
    fun test(bh: Blackhole) {
        (1..1_00).forEach {
            bh.consume(it)
        }
    }

    /**
     * Returned results are implicitly consumed by Blackholes
     */
    @Benchmark
    open fun measureRight(): Double {
        // This is correct: the result is being used.
        return ln(x)
    }

    @Benchmark
    fun newByteArray() {
        val bytes = ByteArray(size)
        bytes[size - 1] = 10
    }
}
