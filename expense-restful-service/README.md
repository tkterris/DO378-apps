# expense-restful-service project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Debugging in Native

Note that, when running in Native, the application returns empty JSON objects. This is because the Expense object needs to be registered for reflection.

## Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `expense-restful-service-1.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/expense-restful-service-1.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your native executable with: `./target/expense-restful-service-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image.

To run the application directly via S2I, run: 
```
BUILD_REPO=https://github.com/tkterris/DO378-apps
oc new-app --name=native-expenses --context-dir=expense-restful-service "quay.io/quarkus/ubi-quarkus-native-s2i:20.2.0-java11~${BUILD_REPO}"
```
