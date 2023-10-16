
package a1016.A1016_6;

public class MultiInterfaceImplExample{
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();

        rc.turnOn();
        rc.turnOff();

        Searchable searchable =new SmartTelevision();
        searchable.search("https://www.youtube.com");
    }
}
