package StringMethods;

public class As1_Message {
    private String machineType;
    private String machineId;
    private String warning;

    public As1_Message(String message) {
        String trimmed = message.trim();
        String[] splitted = trimmed.split(":");

        machineId = trimmed.substring(splitted[0].length() - 1 , splitted[0].length());
        machineType = trimmed.substring(0, splitted[0].length() - 1);
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
        if(warning.contains(keyWord)){
            System.out.println(warning + "___" + machineId + "___" + machineType);
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return machineType+machineId+":" + warning + ".";
    }

}

