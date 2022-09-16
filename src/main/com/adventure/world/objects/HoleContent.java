package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

public class HoleContent {
    private Key content;
    private boolean isCovered;

    /**
     * Initializes the value of the properties.
     * Constructor w/ no parameter.
     */
    public HoleContent(){
        isCovered  = true;
    }

    /**
     * If the Hole is uncovered provide the hole with a content (key).
     * @param key - content of the hole.
     */
    public HoleContent(Key key){
        this.content = key;
    }

    /**
     * This method setting if the Hole is covered.
     */
    public void setIsCovered(boolean isCovered){
        this.isCovered = isCovered;
    }

    /**
     * This method determines if the Hole is covered.
     */
    public boolean isCovered(){
        return isCovered;
    }

    /**
     * This method provides the key.
     */
    public Key getKey(){
        return new Key();
    }
}
