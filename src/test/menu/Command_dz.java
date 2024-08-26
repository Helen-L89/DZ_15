package menu;

public enum Command_dz {
    ADD,
    LIST,
    EXIT;

    public static Command_dz fromString(String command) {

        return Command_dz.valueOf(command.trim().toUpperCase());
    }
}
