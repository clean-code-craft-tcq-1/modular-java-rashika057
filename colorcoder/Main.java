

import paircolorcoder.ColorPair;
import paircolorcoder.ColorPairService;
import paircolorcoder.MajorColor;
import paircolorcoder.MinorColor;

public class Main {
	
	static final int TOTAL_PAIRS = 25;
	public static void main(String[] args) {
		ColorPairService.testNumberToPair(4, new ColorPair(MajorColor.WHITE, MinorColor.BROWN));
		ColorPairService.testNumberToPair(5, new ColorPair(MajorColor.WHITE, MinorColor.SLATE));
    
		ColorPairService.testPairToNumber(new ColorPair(MajorColor.BLACK, MinorColor.ORANGE), 12);
		ColorPairService.testPairToNumber(new ColorPair(MajorColor.VIOLET, MinorColor.SLATE), 25);
		printColorPairs();
    }
	
	public static void printColorPairs() {
    	for(int i=1;i <= TOTAL_PAIRS;i++) {
    		ColorPair pair = ColorPairService.getColorFromNumber(i);
    		System.out.println("Pair number : " +i+", Major color and Minor color: "+pair.toString());
    	}
    } 
}
