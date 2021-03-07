package colorcoder;
public enum MajorColor implements HasIndex {
	
    WHITE(0,"White"),
    RED(1,"Red"),
    BLACK(2,"Black"),
    YELLOW(3,"Yellow"),
    VIOLET(4,"Violet");
	
    private int index;
    private String displayName;
    
    private MajorColor(int index,String displayName) {
        this.index = index;
        this.displayName = displayName;
    }
    
    public int getIndex() {
        return index;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }
    
    public static MajorColor fromIndex(int index) {
        return new EnumEnhancer<>(values()).lookup(index);
      }	
}