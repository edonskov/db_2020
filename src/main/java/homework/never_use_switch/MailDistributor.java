package homework.never_use_switch;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * @author Evgeny Borisov
 */

@Component
public class MailDistributor {

    private Map<Integer, MailSender> mailSenderMap;


    @SneakyThrows
    public MailDistributor(List<MailSender> mailSenderList) {
        this.mailSenderMap = mailSenderList.stream().collect(Collectors.toMap(MailSender::myCode, Function.identity()));
    }

    public void sendMailInfo(MailInfo mailInfo) {
        MailSender mailSender = mailSenderMap.getOrDefault(mailInfo.getMailType(), new DefaultMailSender());
        mailSender.sendMail(mailInfo);
    }
}











