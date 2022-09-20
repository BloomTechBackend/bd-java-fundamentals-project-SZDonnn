package main.com.adventure.settings;

/**
 * Sprint 3 Module 1
 * This CommandVerb will be used instead of strings once we've learned about Enums.
 */

public enum CommandVerb {
    TAKE,
    MOVE,
    USE,
    DIG,
    EXAMINE,
    LOOK,
    INVALID,
    HELP,
    //Used in Sprint 3 Module 2
    FIGHT,
    //Used in Sprint 3 Module 3
    INVENTORY;

    /**
     * Takes verbString to determine and return the associated CommandVerb.
     * @param verbString - the verb from the user input
     * @return - the CommandVerb associated with the given input.
     */
    public static CommandVerb getVerb(String verbString) {
        CommandVerb commandVerb;
        if (verbString.equalsIgnoreCase(CommandVerb.TAKE.name())) {
            commandVerb = CommandVerb.TAKE;
        } else if (verbString.equalsIgnoreCase(CommandVerb.MOVE.name())) {
            commandVerb = CommandVerb.MOVE;
        } else if (verbString.equalsIgnoreCase(CommandVerb.USE.name())) {
            commandVerb = CommandVerb.USE;
        } else if (verbString.equalsIgnoreCase(CommandVerb.DIG.name())) {
            commandVerb = CommandVerb.DIG;
        } else if (verbString.equalsIgnoreCase(CommandVerb.EXAMINE.name())) {
            commandVerb = CommandVerb.EXAMINE;
        } else if (verbString.equalsIgnoreCase(CommandVerb.LOOK.name())) {
            commandVerb = CommandVerb.LOOK;
        } else if (verbString.equalsIgnoreCase(CommandVerb.HELP.name())) {
            commandVerb = CommandVerb.HELP;
        } else if (verbString.equalsIgnoreCase(CommandVerb.FIGHT.name())) {
            commandVerb = CommandVerb.FIGHT;
        } else if (verbString.equalsIgnoreCase(CommandVerb.INVENTORY.name())) {
            commandVerb = CommandVerb.INVENTORY;
        } else {
            commandVerb = CommandVerb.INVALID;
        }
        return commandVerb;
    }

}
