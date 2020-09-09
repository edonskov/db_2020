package real_spring.quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Evgeny Borisov
 */

@Component
public class TerminatorQuoter implements Quoter {

    @Autowired
    @Qualifier("CollectionsBean")
    private List<String> messages;

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }


    public void init() {
        System.out.println("Мне нужна твоя одежду, ботинки и мотоцикл");
    }


    public void killAll() {
        System.out.println("you are terminated...");
    }


}



