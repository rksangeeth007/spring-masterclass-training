package in28minutes.spring.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//Commenting @Component and adding @Repository as it deals wd data retrieval
//@Component
@Repository
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS )
public class JdbcConnection {

    public JdbcConnection() {
        System.out.println("JDBC Connection");
    }
}