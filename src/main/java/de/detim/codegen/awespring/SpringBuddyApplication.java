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
public class SpringBuddyApplication {

    private static final String CLASSPATH = new Object() {
    }.getClass()
            .getEnclosingClass()
            .getProtectionDomain()
            .getCodeSource()
            .getLocation()
            .getPath();

    public static void generateByteCode() {
        try {
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
                    .intercept(FixedValue.value("Hello SpringBuddies!"))
                    .annotateMethod(
                            AnnotationDescription.Builder
                                    .ofType(RequestMapping.class)
                                    .defineArray("value", "/demo", "/omed")
                                    .build())
                    .make()
                    .saveIn(new File(CLASSPATH));
        } catch (Exception ex) {
            System.out.println("Stupid dev!");
        }
    }

    public static void main(String[] args) throws IOException {
        generateByteCode();
        SpringApplication.run(SpringBuddyApplication.class, args);
    }
}
