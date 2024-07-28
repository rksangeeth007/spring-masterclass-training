package in28minutes.spring.basics;

import in28minutes.spring.SpringIn5StepsXMLContextApplication;
import in28minutes.spring.scope.PersonDAO;
import in28minutes.spring.xml.XmlJdbcConnection;
import in28minutes.spring.xml.XmlPersonDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class BinarySearchXMLContextTest {

    @Autowired
    XmlPersonDAO xmlPersonDAO;

    @Test
    public void testbasicScenario(){
        String result = xmlPersonDAO.getXmlJdbcConnection().toString();
        assertEquals("XML DBC Connection", result);
    }
}
