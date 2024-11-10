package Spring;

public class SMSService implements messageService{

    @Override
    public void sendMessage(String message){
        System.out.println("SMS SENT: " + message);
    }
}
