package in28minutes.spring;

import in28minutes.spring.basics.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//We don't need @ComponentScan here as all the beans to be used are under the same classpath.
@SpringBootApplication
public class SpringIn5StepsBasicsApplication {

	public static void main(String[] args) {

		//Commenting below code to implement them using sprintboot DI
//		//Basically, you're decoupling the algos from the binary searches using interfaces, so that from your main apps, you can decide which algo to use for diff use case without making any code changes in binary search.
//		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSortAlgo());
//		int result = binarySearchImpl.binarySearch(new int[] {12,3,4}, 3);
//		System.out.println(result);

		//Application context is created whenever you call SprinApplication.run, which managed all the beans and its dependencies.
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicsApplication.class, args);

		//We retrieve the bean needed by using applicationContext.getBean
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearchImpl.binarySearch(new int[] {12,3,4}, 3);
		System.out.println(result);
	}
}
