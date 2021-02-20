package paircolorcoder;

public enum MinorColor implements Color {

    BLUE(0,"Blue"),
    ORANGE(1,"Orange"),
    GREEN(2,"Green"),
    BROWN(3,"Brown"),
    SLATE(4,"Slate");
	
    private int index;
    private String displayName;
    
    private MinorColor(int index,String displayName) {
        this.index = index;
        this.displayName = displayName;
    }
    
    public int getIndex() {
        return index;
    }
    
    public String getDisplayName() {
		return displayName;
	}    
}
