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
        if(verbString.equalsIgnoreCase(CommandVerb.TAKE.name())) {
            return CommandVerb.TAKE;
        } else if (verbString.equalsIgnoreCase(CommandVerb.MOVE.name())) {
            return CommandVerb.MOVE;
        } else if (verbString.equalsIgnoreCase(CommandVerb.USE.name())) {
            return CommandVerb.USE;
        } else if (verbString.equalsIgnoreCase(CommandVerb.DIG.name())) {
            return CommandVerb.DIG;
        } else if (verbString.equalsIgnoreCase(CommandVerb.EXAMINE.name())) {
            return CommandVerb.EXAMINE;
        } else if (verbString.equalsIgnoreCase(CommandVerb.LOOK.name())) {
            return CommandVerb.LOOK;
        } else if (verbString.equalsIgnoreCase(CommandVerb.HELP.name())) {
            return CommandVerb.HELP;
        } else if (verbString.equalsIgnoreCase(CommandVerb.FIGHT.name())) {
            return CommandVerb.FIGHT;
        } else if (verbString.equalsIgnoreCase(CommandVerb.INVENTORY.name())) {
            return CommandVerb.INVENTORY;
        } else {
            return CommandVerb.INVALID;
        }
    }

}
