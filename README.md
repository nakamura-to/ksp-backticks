# ksp-backticks

KSP 2.0.21-1.0.26 has an [issue](https://github.com/google/ksp/issues/2172) where, when the `ksp.useKSP2` option is enabled, 
it does not recognize annotations with package names enclosed in backticks. 
This project is intended to reproduce that issue.

This project consists of the following three subprojects:
- lib-core: provides an annotation
- lib-processor: provides a SymbolProcessor
- client: utilizes the annotation and SymbolProcessor

## Steps to Reproduce

Run the following command at the root of this project:
```shell
$ ./gradlew clean build -Pksp.useKSP2=true --no-daemon
```

Then, the following output will appear:
```
> Task :client:kspKotlin
w: [ksp] symbols: []
```

Next, set `ksp.useKSP2` to `false` and run the command.
```shell
$ ./gradlew clean build -Pksp.useKSP2=false --no-daemon
```

Then, the following output will be displayed, showing that the result differs from the initial command execution.
```
> Task :client:kspKotlin
w: [ksp] symbols: [User]
```
