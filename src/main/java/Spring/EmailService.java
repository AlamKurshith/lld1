package Spring;

public class EmailService implements messageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}
