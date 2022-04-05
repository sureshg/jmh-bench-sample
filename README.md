## :hourglass: [JMH][jmh_url] Benchmark Sample

<a href="https://foojay.io/today/works-with-openjdk">
 <img align="right" src="https://github.com/foojayio/badges/raw/main/works_with_openjdk/WorksWithOpenJDK.svg" width="7%" alt="WorksWithOpenJDK">
</a>

[![GitHub Workflow Status][shieldio_img]][gha_url]
[![JMH][jmh_img]][jmh_url]
[![Kotlin release][kt_img]][kt_url]
[![OpenJDK Version][java_img]][java_url]
[![Language grade: Java][lgtm_img]][lgtm_url]
[![Style guide][sty_img]][sty_url]

A sample repo for building **Java** and **Kotlin** benchmarks with JMH and publish the artifacts
to [Github Package Registry][github-packages].

- #### :building_construction: Build & Run

```bash
$ ./mvnw clean verify 
$ java --enable-preview -jar target/benchmarks.jar

# Get a list of supported formats
$ java --enable-preview -jar target/benchmarks.jar -lrf

# For JSON output
$ java --enable-preview -jar target/benchmarks.jar -rf json
```


- #### :running: Run with profiling (requires [hsdis][hsdis])

```bash
$ java --enable-preview -jar target/benchmarks.jar -prof perfasm
```

##### :art: JMH Visualization

 [JMH Benchmarks Viz](https://suresh.dev/jmh-bench-sample/?source=jmh-result-Linux.json)

##### :bookmark: Resources

- [JMH Samples](https://github.com/openjdk/jmh/tree/master/jmh-samples/src/main/java/org/openjdk/jmh/samples)
- [JMH Kotlin Archetype](https://github.com/openjdk/jmh/tree/master/jmh-archetypes/jmh-kotlin-benchmark-archetype)
- [Kotlin Benchmarks](https://github.com/Kotlin/kotlin-benchmarks)
- [Intellij JMH Plugin](https://plugins.jetbrains.com/intellij-platform-explorer/7529)
- [JMH Visualizer](https://github.com/jzillmann/jmh-visualizer)
- [JMH Gradle Plugin](https://github.com/melix/jmh-gradle-plugin)
- [JMH Gradle Report](https://github.com/jzillmann/gradle-jmh-report)
- [Github Action - Java with Maven](https://docs.github.com/en/actions/guides/building-and-testing-java-with-maven)

##### :hammer_and_wrench: Misc

```bash
# Maven and dependencies updates.
$ mvn wrapper:wrapper
$ ./mvnw --version
$ ./mvnw clean versions:display-dependency-updates versions:display-plugin-updates versions:display-property-updates
```

##### :copyright: Credits

---

* [JMH Samples](https://github.com/openjdk/jmh/tree/master/jmh-samples)
* [JCStress Samples](https://github.com/openjdk/jcstress/tree/master/jcstress-samples)



[github-packages]: https://github.com/sureshg/jmh-bench-sample/packages
[jmh-archetypes]: https://github.com/openjdk/jmh/tree/master/jmh-archetypes

[kt_url]: https://github.com/JetBrains/kotlin/releases/latest
[kt_img]: https://img.shields.io/github/v/release/Jetbrains/kotlin?include_prereleases&color=7f53ff&label=Kotlin&logo=kotlin&logoColor=7f53ff&style=for-the-badge

[jmh_url]: https://github.com/openjdk/jmh#java-microbenchmark-harness-jmh
[jmh_img]: https://img.shields.io/maven-central/v/org.openjdk.jmh/jmh-core?color=cd2237&label=Jmh-Core&logo=apache%20maven&logoColor=cd2237&style=for-the-badge

[java_url]: https://jdk.java.net/
[java_img]: https://img.shields.io/badge/OpenJDK-jdk--19-ea791d?logo=java&style=for-the-badge&logoColor=ea791d

[gha_url]: https://github.com/sureshg/jmh-bench-sample/actions/workflows/build.yml
[gha_img]: https://github.com/sureshg/jmh-bench-sample/actions/workflows/build.yml/badge.svg?branch=main
[shieldio_img]: https://img.shields.io/github/workflow/status/sureshg/jmh-bench-sample/JMH%20CI/main?color=green&label=JMH%20CI%20Build&logo=Github-Actions&logoColor=green&style=for-the-badge

[sty_url]: https://kotlinlang.org/docs/coding-conventions.html
[sty_img]: https://img.shields.io/badge/style-Kotlin--Official-40c4ff.svg?style=for-the-badge&logo=kotlin&logoColor=40c4ff

[lgtm_url]: https://lgtm.com/projects/g/sureshg/jmh-bench-sample/context:java
[lgtm_img]: https://img.shields.io/lgtm/grade/java/github/sureshg/jmh-bench-sample.svg?logo=lgtm&style=for-the-badge

[hsdis]: https://github.com/AdoptOpenJDK/jitwatch/wiki/Building-hsdis