package de.detim.codegen.awespring;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.implementation.FixedValue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Modifier;

@SpringBootApplication
@ComponentScan(basePackages = {"de.detim.codegen.**"})
public class AwespringApplication {

    private static final String CLASSPATH = new Object() {
    }.getClass()
            .getEnclosingClass()
            .getProtectionDomain()
            .getCodeSource()
            .getLocation()
            .getPath();


    public static void main(String[] args) throws IOException {
        new ByteBuddy()
                .subclass(Object.class)
                .name("de.detim.codegen.awespring.GenController")
                .annotateType(AnnotationDescription.Builder
                                      .ofType(RestController.class)
                                      .build())
                .defineMethod(
                        "home",
                        String.class,
                        Modifier.PUBLIC
                )
                .intercept(FixedValue.value("Hello GenWorld!"))
                .annotateMethod(
                        AnnotationDescription.Builder
                                .ofType(RequestMapping.class)
                                .defineArray("value", "/a", "/b")
                                .build())
                .make()
                .saveIn(new File(CLASSPATH));

        SpringApplication.run(AwespringApplication.class, args);
    }
}
