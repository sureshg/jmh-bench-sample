## [JMH][jmh] Benchmark Sample   [![JMH Sample CI][badge]][github-workflow]

   A sample repo for building **Java** and **Kotlin** benchmarks with JMH and publish the artifacts to [Github Package Registry][github-packages].

- #### Build & Run

```bash
$ ./mvnw clean verify 
$ java -jar target/benchmarks.jar
```

- #### Run with profiling (requires [hsdis][hsdis])

```bash
$ java -jar target/benchmarks.jar -prof perfasm
```

[jmh]: https://openjdk.java.net/projects/code-tools/jmh/	"JMH"
[hsdis]: https://github.com/AdoptOpenJDK/jitwatch/wiki/Building-hsdis	"hsdis"
[badge]: https://img.shields.io/github/workflow/status/sureshg/jmh-bench-sample/JMH%20Sample%20CI?label=JMH%20Build&style=for-the-badge
[github-badge]: https://github.com/sureshg/jmh-bench-sample/workflows/JMH%20Sample%20CI/badge.svg
[github-packages]: https://github.com/sureshg/jmh-bench-sample/packages
[github-workflow]: https://github.com/sureshg/jmh-bench-sample/actions
[jmh-archetypes]: https://github.com/openjdk/jmh/tree/master/jmh-archetypes

##### Misc
 - [JMH Samples](https://github.com/openjdk/jmh/tree/master/jmh-samples/src/main/java/org/openjdk/jmh/samples)
 - [JMH Kotlin Archetype](https://github.com/openjdk/jmh/tree/master/jmh-archetypes/jmh-kotlin-benchmark-archetype)
 - [Kotlin Benchmarks](https://github.com/Kotlin/kotlin-benchmarks)
 
##### Credits

---

​     This is a slightly modified version of [Aleksey Shipilev's](https://github.com/shipilev) sample.

