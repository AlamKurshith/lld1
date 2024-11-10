package Spring;

public class Main {

    public static void main(String[] args) {


        SMSService sms = new SMSService();
        notificationService service = new notificationService(sms); // Injecting service type
        service.notifyUser("Hello via sms");

        // Switching the service

        messageService emailService =  new EmailService();
        notificationService service1 = new notificationService(emailService);
        service1.notifyUser("Hello via email");




    }
}
