package in28minutes.spring.basics;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import in28minutes.spring.basics.*;
import in28minutes.spring.*;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringIn5StepsBasicSpringApplication.class)
public class BinarySearchTest {

    @Autowired
BinarySearchImpl binarySearch;

    @Test
    public void testbasicScenario(){
        int result = binarySearch.binarySearch(new int[]{}, 5);
        assertEquals(3, result);
    }
}
