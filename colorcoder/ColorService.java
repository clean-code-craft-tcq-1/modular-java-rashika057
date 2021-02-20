package colorcoder;
public class ColorService {
	public static Color fromIndex(int index,Color[] values) {
        for(Color color: values) {
            if(color.getIndex() == index) {
                return color;
            }
        }
        return null;
    }
}
