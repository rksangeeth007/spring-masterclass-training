package in28minutes.spring;

import in28minutes.spring.componentscan.ComponentPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//We don't need @ComponentScan here as all the beans to be used are under the same classpath.
@SpringBootApplication
@ComponentScan("com.in28minutes.spring.componentscan")
public class SpringIn5StepsComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);

		ComponentPersonDAO componentPersonDAO = applicationContext.getBean(ComponentPersonDAO.class);

		LOGGER.info("{}",componentPersonDAO);


	}

}
