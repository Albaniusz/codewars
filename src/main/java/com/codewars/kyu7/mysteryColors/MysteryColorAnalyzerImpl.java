package com.codewars.kyu7.mysteryColors;

import java.util.List;

/**
 * Create the implementation for the interface below. The implementation needs to be called "MysteryColorAnalyzerImpl".
 * <p>
 * import java.util.List;<br/>
 * public interface MysteryColorAnalyzer {<br/>
 * /**<br/>
 * * This method will determine how many distinct colors are in the given list<br/>
 * * Colors are defined via the {@link Color} enum.<br/>
 * * @param mysteryColors list of colors from which to determine the number of distinct colors<br/>
 * * @return number of distinct colors<br/>
 * *<br/>
 * int numberOfDistinctColors(List<Color> mysteryColors);<br/>
 * /**<br/>
 * * This method will count how often a specific color is in the given list<br/>
 * * Colors are defined via the {@link Color} enum.<br/>
 * * @param mysteryColors list of colors from which to determine the count of a specific color<br/>
 * * @param color color to count<br/>
 * * @return number of occurrence of the color in the list<br/>
 * *<br/>
 * int colorOccurrence(List<Color> mysteryColors, Color color);<br/>
 * }
 * <p>
 * Color has the following enum structure,but hey you really don't need to know all these colors if you're implementing the methods properly .
 * <p>
 * public enum Color {<br/>
 * RED,GREEN,BLUE<br/>
 * }
 */
public class MysteryColorAnalyzerImpl implements MysteryColorAnalyzer {
    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {
        return (int) mysteryColors.stream()
            .distinct()
            .count();
    }

    @Override
    public int colorOccurrence(List<Color> mysteryColors, Color color) {
        return (int) mysteryColors.stream()
            .filter(item -> item.equals(color))
            .count();
    }
}
