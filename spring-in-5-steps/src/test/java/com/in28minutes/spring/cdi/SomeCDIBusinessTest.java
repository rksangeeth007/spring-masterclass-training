package in28minutes.spring.cdi;

import in28minutes.spring.xml.XmlPersonDAO;
import in28minutes.spring.cdi.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class SomeCDIBusinessTest {

    @InjectMocks
    SomeCdiBusiness someCdiBusiness;

    @Mock
    SomeCdiDao daoMock;

    @Test
    public void testbasicScenario(){
        Mockito.when(daoMock.get_numbers()).thenReturn(new int[] { 5, 20, 3});
        assertEquals(20, someCdiBusiness.greatest_num());
    }

    @Test
    public void testbasicScenario_null(){
        Mockito.when(daoMock.get_numbers()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE, someCdiBusiness.greatest_num());
    }

    @Test
    public void testbasicScenario_equal(){
        Mockito.when(daoMock.get_numbers()).thenReturn(new int[] {2,2});
        assertEquals(2, someCdiBusiness.greatest_num());
    }

}
