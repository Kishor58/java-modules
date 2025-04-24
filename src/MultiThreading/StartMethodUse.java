package MultiThreading;

public class StartMethodUse extends Thread{
    private String user;

    StartMethodUse(String user) {
        this.user = user;
    }

    public void run() {
        System.out.println("Handling chat for user: " + user);
    }

    public static void main(String[] args) {
        StartMethodUse user1=new StartMethodUse("Alice");
        StartMethodUse user2=new StartMethodUse("Bob");
        StartMethodUse user3=new StartMethodUse("Charlie");

        user1.start();
        user2.start();
        user3.start();
    }

}
