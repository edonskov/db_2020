package real_spring;

import heroes.RandomUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import real_spring.quoters.IntegerFactory;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = {"real_spring","my_spring"})
public class Conf {

    @Bean
    public Integer randomInt(){
        return RandomUtil.getIntBetween(1, 100);
    }

    @Bean
    public IntegerFactory integerFactory(){
        return new IntegerFactory(12, 120);
    }
}
