# DO378-apps

Run in dev mode: `mvn quarkus:dev`
Build for JVM: `mvn package`
Run JVM: `java -jar target/quarkus-app/quarkus-run.jar`
Build for Native: `mvn package -Pnative -Dquarkus.native.container-build=true`
Run native: `./target/<project_name>-<version>-runner`

For the following, add the docker container image builder via `mvn quarkus:add-extension -Dextensions="container-image-docker"`
Build container image for JVM (didn't work for me due to subscription issues): `mvn package -Dquarkus.container-image.build=true -Dquarkus.container-image.builder=docker`
Build container image for Native: `mvn package -Pnative -Dquarkus.native.container-build=true -Dquarkus.container-image.build=true -Dquarkus.container-image.builder=docker`

