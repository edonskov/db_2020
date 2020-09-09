package real_spring.quoters;

import heroes.RandomUtil;
import my_spring.BeanDefinitionValidatorBeanFactoryPostProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Configuration
public class Conf {

    @Value("${terminator.value1}")
    String value1;

    @Value("${terminator.value2}")
    public String value2;

    @Value("${terminator.anotherQuote}")
    public String anotherQuote;

//    @Bean
//    public InjectRandomIntAnnotationBeanPostProcessor inject() {
//        return new InjectRandomIntAnnotationBeanPostProcessor();
//    }
//
//    @Bean
//    public BeanDefinitionValidatorBeanFactoryPostProcessor inject2() {
//        return new BeanDefinitionValidatorBeanFactoryPostProcessor();
//    }

    @Bean
    public Integer randomInt(int x, int y){
        return RandomUtil.getIntBetween(x, y);
    }

    @Bean
    @Qualifier("CollectionsBean")
    public List <String> values() {
        return List.of(value1, anotherQuote, value2);
    };


}
