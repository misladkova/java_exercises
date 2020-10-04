
public class Main {

    public static void main(String[] args) {

        Message first = new Message("tom", "hey meet me outside");
        Message second = new Message("lol", "5 min");
        Message third = new Message("tom", "ok");

        MessagingService messagingService = new MessagingService();

        messagingService.add(first);
        messagingService.add(second);
        messagingService.add(third);

        System.out.println(messagingService.getMessages());
    }
}
