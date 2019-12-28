package factory.simple;

import factory.MailSender;
import factory.Sender;
import factory.SmsSender;

public class SimpleFactory {
    public Sender senderProduce(String name){
        if("mail".equals(name)){
            return  new MailSender();
        }else if ("sms".equals(name))
        {
            return new SmsSender();
        }else{
            System.out.println("输入错误");
            return null;
        }
    }
}
