package Data;

public class IDGenerator {
    public static Object UUIDGenerator(){
        java.util.UUID uuid = java.util.UUID.randomUUID();
        return uuid;
    }
}
