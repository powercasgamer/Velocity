dependencies {
    compileOnly(project(":velocity-api"))
    annotationProcessor(project(":velocity-api"))
}

tasks {
    withType<Checkstyle> {
        exclude("**/com/velocitypowered/testplugin/**")
    }
}
