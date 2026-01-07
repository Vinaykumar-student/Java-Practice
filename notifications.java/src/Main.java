public class Main {
    public static void main(String[] a){
        Notifications n=new EmailNotifications();
        Notifications n1=new SystemNotification();
        n.msg();
        n1.msg();
    }
}
