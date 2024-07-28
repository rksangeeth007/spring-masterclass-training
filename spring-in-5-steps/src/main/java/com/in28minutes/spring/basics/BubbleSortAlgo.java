package in28minutes.spring.basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//Adding @Primary as we got 2 beans(BubbleSortAlgo and QuickSortAlgo) of same type SortAlgo under the classpath and we need to define which one is having priority
//Adding @Service and commenting @Component
@Component
//@Service
@Primary
public class BubbleSortAlgo implements SortAlgo{

    public int[] sort(int[] numbers){
        //Consider bubble sort logic is written.
        return numbers;
    }
}
