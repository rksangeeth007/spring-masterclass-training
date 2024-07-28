package in28minutes.spring;

import in28minutes.spring.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIn5StepsXMLContextApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            LOGGER.info("Beans created  -> {}", (Object) applicationContext.getBeanDefinitionNames());

            XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
            LOGGER.info("{} _ {}", xmlPersonDAO, xmlPersonDAO.getXmlJdbcConnection());
        }
    }
}
