package StringMethods;

public class As1_Message {
    private String machineType;
    private String machineId;
    private String warning;

    public As1_Message(String message) {
        String trimmed = message.trim();
        String[] splitted = trimmed.split(":");

        machineId = trimmed.substring(splitted.length-1 , splitted.length);
        machineType = trimmed.substring(0, splitted.length - 1);
        warning = splitted[1];
    }//As1_Message

    public String getMachineType() {
        return machineType;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getWarning() {
        return warning;
    }

    public Boolean scanWarning(String keyWord) {
        return false;
    }

    public String toString(){
        return machineType+machineId+":" + warning + ".";
    }

}

