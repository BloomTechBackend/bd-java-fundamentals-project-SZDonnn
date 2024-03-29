package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

public class HoleContent {
    private Key content;
    private boolean isCovered = true;

    /**
     * Constructor HoleContent with no parameters.
     */
    public HoleContent() {
    }

    /**
     * Constructor HoleContent.
     * @param key - for updating content property.
     */
    public HoleContent(Key key) {
        content = key;
    }

    public void setIsCovered(boolean isCovered) {
        this.isCovered = isCovered;
    }

    public boolean isCovered() {
        return isCovered;
    }

    public Key getKey() {
        return content;
    }
}
