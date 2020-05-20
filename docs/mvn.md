
#### Maven artifacts and plugin versions check

```bash
$ ./mvnw clean versions:display-dependency-updates versions:display-plugin-updates
```

#### Configure Sonatype OSS repo

```xml
<project>
  <repositories>
        <repository>
            <id>sonatype-oss</id>
            <name>Sonatype OSS</name>
            <url>https://oss.sonatype.org/content/repositories/snapshots</url>
            <snapshots>
                <enabled>true</enabled>
            </snapshots>
        </repository>
    </repositories>

    <pluginRepositories>
        <pluginRepository>
            <id>sonatype.oss.snapshots</id>
            <name>Sonatype OSS Snapshot Repository</name>
            <url>https://oss.sonatype.org/content/repositories/snapshots</url>
            <releases>
                <enabled>false</enabled>
            </releases>
            <snapshots>
                <enabled>true</enabled>
            </snapshots>
        </pluginRepository>
    </pluginRepositories>
</project>
```