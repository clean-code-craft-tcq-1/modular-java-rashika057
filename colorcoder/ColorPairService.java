package colorcoder;
public final class ColorPairService {	
	
    static final int NUMBER_OF_MAJOR_COLORS = MajorColor.values().length;
    
    static final int NUMBER_OF_MINOR_COLORS = MinorColor.values().length;

    public static ColorPair getColorFromNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = 
        		(MajorColor) ColorService.fromIndex(zeroBasedPairNumber / NUMBER_OF_MAJOR_COLORS, MajorColor.values());
        MinorColor minorColor =
        		(MinorColor) ColorService.fromIndex(zeroBasedPairNumber % NUMBER_OF_MAJOR_COLORS, MinorColor.values());
        return new ColorPair(majorColor, minorColor);
    }
    
    static int getNumberFromColor(ColorPair pair) {
        return pair.getMajor().getIndex() * NUMBER_OF_MINOR_COLORS + pair.getMinor().getIndex() + 1;
    }

    public static void testNumberToPair(int pairNumber,
    		ColorPair expectedPair)
    {
        ColorPair colorPair = getColorFromNumber(pairNumber);
        System.out.println("Got pair " + colorPair.toString());
        assert(colorPair.getMajor() == expectedPair.getMajor());
        assert(colorPair.getMinor() == expectedPair.getMinor());
    }

    public static void testPairToNumber(
    		ColorPair pair,
        int expectedNumber)
    {
        int pairNumber = getNumberFromColor(pair);
        System.out.println("Got pair number " + pairNumber);
        assert(pairNumber == expectedNumber);
    }       
}
