package com.codewars.kyu7.drivingLicence;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * In the United Kingdom, the driving licence is the official document which authorises its holder to operate various types of motor vehicle on highways and some other roads to which the public have access. In England, Scotland and Wales they are administered by the Driver and Vehicle Licensing Agency (DVLA) and in Northern Ireland by the Driver & Vehicle Agency (DVA). A driving licence is required in the UK by any person driving a vehicle on any highway or other road defined in s.192 Road Traffic Act 1988[1] irrespective of ownership of the land over which the road passes, thus including many which allow the public to pass over private land; similar requirements apply in Northern Ireland under the Road Traffic (Northern Ireland) Order 1981. (Source Wikipedia)
 * <p>
 * <h2>Task</h2>
 * <p>
 * The UK driving number is made up from the personal details of the driver. The individual letters and digits can be code using the below information
 * <p>
 * <h2>Rules</h2>
 * <pre>
 * 1–5: The first five characters of the surname (padded with 9s if less than 5 characters)
 * 6: The decade digit from the year of birth (e.g. for 1987 it would be 8)
 * 7–8: The month of birth (7th character incremented by 5 if driver is female i.e. 51–62 instead of 01–12)
 * 9–10: The date within the month of birth
 * 11: The year digit from the year of birth (e.g. for 1987 it would be 7)
 * 12–13: The first two initials of the first name and middle name, padded with a 9 if no middle name
 * 14: Arbitrary digit – usually 9, but decremented to differentiate drivers with the first 13 characters in common. We will always use 9
 * 15–16: Two computer check digits. We will always use "AA"
 * </pre>
 * <p>
 * Your task is to code a UK driving license number using an Array of data. The Array will look like
 * data = {"John","James","Smith","01-Jan-2000","M"};
 * <p>
 * Where the elements are as follows
 *
 * <pre>
 * 0 = Forename
 * 1 = Middle Name (if any)
 * 2 = Surname
 * 3 = Date of Birth (In the format Day Month Year, this could include the full Month name or just shorthand ie September or Sep)
 * 4 = M-Male or F-Female
 * </pre>
 * You will need to output the full 16 digit driving license number.
 * <p>
 * Good luck and enjoy!
 */
public class Solution {
    private final static String FEMALE = "F";

    public static String driver(final String[] data) {
        StringBuilder stringBuilder = new StringBuilder();

        // 1–5:The first five characters of the surname(padded with 9s if less than 5 characters)
        String surname = data[2];
        surname = surname.toUpperCase();
        if (surname.length() < 5) {
            stringBuilder.append(surname);
            stringBuilder.append("9".repeat(5 - surname.length()));
        } else {
            stringBuilder.append(surname.substring(0, 5));
        }

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Date date = null;

        try {
            date = formatter.parse(data[3]);

            // 6:The decade digit from the year of birth (e.g. for 1987 it would be 8)
            stringBuilder.append((date.getYear() / 10) % 10);

            // 7–8:The month of birth (7 th character incremented by 5 if driver is female i.e. 51–62 instead of 01–12)
            int month = date.getMonth() + 1;
            int monthAddon = FEMALE.equals(data[4]) ? 5 : 0;

            if (month < 10) {
                stringBuilder.append(monthAddon);
                stringBuilder.append(month);
            } else {
                stringBuilder.append(month + (monthAddon * 10));
            }


            // 9–10:The date within the month of birth
            int day = date.getDate();
            if (day < 10) {
                stringBuilder.append(0);
            }
            stringBuilder.append(day);

            // 11:The year digit from the year of birth (e.g. for 1987 it would be 7)
            stringBuilder.append(date.getYear() % 10);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        // 12–13:The first two initials of the first name and middle name, padded with a 9 if no middle name
        String firstName = data[0].substring(0,1) + (data[1].length() > 1 ? data[1].substring(0,1) : "9");
        stringBuilder.append(firstName.toUpperCase());

        // 14:Arbitrary digit –usually 9, but decremented to differentiate drivers with the first 13 characters in
        // common.We will always use 9
        stringBuilder.append("9");

        // 15–16: Two computer check digits. We will always use "AA"
        stringBuilder.append("AA");

        return stringBuilder.toString();
    }
}
