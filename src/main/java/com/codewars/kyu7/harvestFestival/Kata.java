package com.codewars.kyu7.harvestFestival;

/**
 * You have cultivated a plant, and after months of hard work, the time has come to reap the flowers of your hard work. When it was growing, you added water and fertilizer, and kept a constant temperature. It's time check how much your plant has grown.
 * <p>
 * A plant is represented horizontally, from the base to the left, to the end to the right:
 * <pre>
 * ---@---@---@
 * </pre>
 * The stem is represented by hyphens -, and the flowers are represented by symbols. A plant always starts with the stem, and always ends with flowers.
 * <p>
 * Four parameters will be given. The four parameters are:
 * <ul>
 * <li>seed (string) - determines the type of flowers generated by the plant.</li>
 * <li>water (integer) - each unit of water extends the portion of stem between the flowers. It also gives how many times the stems + flower clusters should be repeated</li>
 * <li>fert (integer) - each unit of fertilizer increases the amount of flowers, grouped in clusters</li>
 * <li>temp (integer) - if the temperature given is in the range of 20°C and 30°C, the plant grows normally, otherwise, all the flowers die except for one flower at the end of the stem.</li>
 * </ul>
 * Given the above parameters, your task is to return a string representing the plant.
 * <p>
 * <h3>Examples</h3>
 * <pre>
 * plant("@", 3, 3, 25) => "---@@@---@@@---@@@"
 * # Water gives the length of the stem portions between flowers
 * # Water also gives the total number of segments(number of times flowers + stems should be repeated)
 * # Fertilizer gives the length of the flower clusters.
 * # Temperature is in the range of 20°C and 30°C
 *
 * plant("$", 4, 2, 30) => "----$$----$$----$$----$$"
 *
 * plant("&", 1, 5, 20) => "-&&&&&"
 *
 * plant("^", 3, 3, 35) => "---------^"
 * # The temperature is not in the correct range, so all flowers die, except the last one at the end.
 * # The stem is not affected by the temperature
 * </pre>
 * <h3>Notes</h3>
 * Edge conditions will not be tested, meaning parameters of water or fertilizer or temperature being zero. This will not be tested. The parameters will always be valid (no zero).
 * The temperature bounds are inclusive (20 and 30 will be included as 21, 22, 23, 24...)
 * Happy Coding!
 */
public class Kata {
    public static String plant(char seed, int water, int fert, int temp) {
        StringBuilder plant = new StringBuilder();

        for (int i = 0; i < water; i++) {
            plant.append("-".repeat(water));

            if (isTemperatureOk(temp)) {
                plant.append(String.valueOf(seed).repeat(fert));
            }
        }

        if (!isTemperatureOk(temp)) {
            plant.append(seed);
        }

        return plant.toString();
    }

    private static boolean isTemperatureOk(int temp) {
        return temp >= 20 && temp <= 30;
    }
}
