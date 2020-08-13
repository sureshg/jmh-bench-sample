## [JMH][jmh_url] Benchmark Sample   

[![GitHub Workflow Status][shieldio_img]][gha_url] 
[![JMH][jmh_img]][jmh_url] 
[![Kotlin release][kt_img]][kt_url] 
[![OpenJDK Version][java_img]][java_url] 
[![Style guide][sty_img]][sty_url]

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

##### Misc
 - [JMH Samples](https://github.com/openjdk/jmh/tree/master/jmh-samples/src/main/java/org/openjdk/jmh/samples)
 - [JMH Kotlin Archetype](https://github.com/openjdk/jmh/tree/master/jmh-archetypes/jmh-kotlin-benchmark-archetype)
 - [Kotlin Benchmarks](https://github.com/Kotlin/kotlin-benchmarks)
 
##### Credits

---

 This is a slightly modified version of [Aleksey Shipilev's](https://github.com/shipilev) sample.


[github-packages]: https://github.com/sureshg/jmh-bench-sample/packages
[jmh-archetypes]: https://github.com/openjdk/jmh/tree/master/jmh-archetypes

[kt_url]: https://github.com/JetBrains/kotlin/releases/latest
[kt_img]: https://img.shields.io/github/release/JetBrains/kotlin.svg?label=Kotlin&logo=kotlin&style=for-the-badge

[jmh_url]: https://openjdk.java.net/projects/code-tools/jmh/
[jmh_img]: https://img.shields.io/maven-central/v/org.openjdk.jmh/jmh-core?color=magenta&label=Jmh-Core&logo=apache%20maven&logoColor=magenta&style=for-the-badge

[java_url]: https://jdk.java.net/
[java_img]: https://img.shields.io/badge/OpenJDK-jdk--11-red?logo=java&style=for-the-badge&logoColor=red

[gha_url]: https://github.com/sureshg/jmh-bench-sample/actions
[gha_img]: https://github.com/sureshg/jmh-bench-sample/workflows/JMH%20CI/badge.svg?branch=master                         
[shieldio_img]:https://img.shields.io/github/workflow/status/sureshg/jmh-bench-sample/JMH%20Sample%20CI?color=green&label=Build&logo=Github-Actions&logoColor=green&style=for-the-badge

[sty_url]: https://kotlinlang.org/docs/reference/coding-conventions.html
[sty_img]: https://img.shields.io/badge/style-Kotlin--Official-40c4ff.svg?style=for-the-badge&logo=kotlin&logoColor=40c4ff

