import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> messagingService;

    public MessagingService(){
        this.messagingService = new ArrayList<>();
    }

    public void add(Message message){
        String dlzka = message.getContent();
        if (dlzka.length()<=280){
            messagingService.add(message);
        }
    }

    public ArrayList<Message> getMessages(){
        return messagingService;
    }

}


