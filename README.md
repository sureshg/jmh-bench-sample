## [JMH][JMH] Benchmark Sample

- ##### Build & Run

```bash
$ ./mvnw verify 
$ java -jar target/benchmarks.jar
```

- ##### Run with profiling (requires [hsdis][hsdis])

```bash
$ java -jar target/benchmarks.jar -prof perfasm
```



[JMH]: JMHhttps://openjdk.java.net/projects/code-tools/jmh/	"JMH"
[hsdis]: https://github.com/AdoptOpenJDK/jitwatch/wiki/Building-hsdis	"hsdis"



##### Credits

---

​      The base template is copied from [Aleksey Shipilev](https://github.com/shipilev)

