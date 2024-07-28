package in28minutes.spring;

import in28minutes.spring.basics.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component
@ComponentScan("in28minutes.spring.basics")
public class SpringIn5StepsBasicSpringApplication {

    public static void main(String[] args) {

        try
                (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicSpringApplication.class)) {

            BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
            int result = binarySearchImpl.binarySearch(new int[]{12, 3, 4}, 3);
            System.out.println(result);
        }

        //You can either close as below or use try-catch on AnnotationConfigApplicationContext, which is implemnted via autoclose mechanism
    }

}
