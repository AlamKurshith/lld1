package Spring;

public class notificationService {

    //private EmailService emailService = new EmailService(); // Tightly coupled, i.e, saying this is the only object to be used.

//    public void notifyUser(String message){
//        emailService.sendMail(message);
//    }

    private messageService service;
    public notificationService(messageService service){
        this.service = service;
    }

    public void notifyUser(String message){
        service.sendMessage(message);
    }

}
