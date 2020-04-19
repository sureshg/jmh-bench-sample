## [JMH][jmh] Benchmark Sample 

![JMH Sample CI][badge]

- #### Build & Run

```bash
$ ./mvnw verify 
$ java -jar target/benchmarks.jar
```

- #### Run with profiling (requires [hsdis][hsdis])

```bash
$ java -jar target/benchmarks.jar -prof perfasm
```


[jmh]: JMHhttps://openjdk.java.net/projects/code-tools/jmh/	"JMH"
[hsdis]: https://github.com/AdoptOpenJDK/jitwatch/wiki/Building-hsdis	"hsdis"
[badge]: https://github.com/sureshg/jmh-bench-sample/workflows/JMH%20Sample%20CI/badge.svg

##### Credits

---

​     This is a slightly modified version of [Aleksey Shipilev's](https://github.com/shipilev) sample.

