package in28minutes.spring.cdi;

import javax.inject.Named;

@Named
public class SomeCdiDao {

    public int[] get_numbers(){
        return new int[] { 23, 50, 2, 60};
    }
}
