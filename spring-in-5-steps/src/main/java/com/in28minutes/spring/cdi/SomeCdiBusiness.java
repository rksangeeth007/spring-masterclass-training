package in28minutes.spring.cdi;

import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {

    @Inject
    SomeCdiDao someCdiDao;

    public SomeCdiDao getSomeCdiDao() {
        return someCdiDao;
    }

    public void setSomeCdiDao(SomeCdiDao someCdiDao) {
        this.someCdiDao = someCdiDao;
    }

    public int greatest_num() {

        int greatest = Integer.MIN_VALUE;
        int[] data = someCdiDao.get_numbers();
        for(int i: data) {
            if(i > greatest){
                greatest = i;
            }
        }
        return greatest;
    }
}
