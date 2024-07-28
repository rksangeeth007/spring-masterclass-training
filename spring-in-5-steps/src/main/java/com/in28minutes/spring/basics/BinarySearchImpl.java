package in28minutes.spring.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//import javax.annotation.PostConstruct;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;
//import javax.annotation.PreDestroy;


@Component
//@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Service
public class BinarySearchImpl {

    @Autowired
    //    @Qualifier("quick")
    private SortAlgo sortAlgo;

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    //Below one is eg: of Constructor overloading, if you comment it out, It works as Setter injection by default as @Autowired is present
//    public BinarySearchImpl(SortAlgo sortAlgo) {
//        super();
//        this.sortAlgo = sortAlgo;
//    }


    public int binarySearch(int[] numbers, int num){

        int[] sortedNumbers = sortAlgo.sort(numbers);
        System.out.println(sortAlgo);
        return 3;
    }

    @PostConstruct
    public void MyPostConstruct(){
        LOGGER.info("POSTCONSTRUCT is called");
    }

    @PreDestroy
    public void MyPreDestroy(){
        LOGGER.info("PREDESTROY is called");
    }


}
