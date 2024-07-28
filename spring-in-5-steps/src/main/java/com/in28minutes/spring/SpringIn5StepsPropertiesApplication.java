package in28minutes.spring;

import in28minutes.spring.properties.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan
@PropertySource(("classpath:app.properties"))
public class SpringIn5StepsPropertiesApplication {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class)) {
            SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
            System.out.println(service.getUrl());
        }
    }
}
