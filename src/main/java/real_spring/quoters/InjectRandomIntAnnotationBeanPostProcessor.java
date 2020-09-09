package real_spring.quoters;

import my_spring.ApplicationContext;
import my_spring.InjectRandomIntAnnotationObjectConfigurer;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Component
public class InjectRandomIntAnnotationBeanPostProcessor implements BeanPostProcessor {
    private InjectRandomIntAnnotationObjectConfigurer configurer = new InjectRandomIntAnnotationObjectConfigurer();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        configurer.configure(bean, null);
        return bean;

    }

}
