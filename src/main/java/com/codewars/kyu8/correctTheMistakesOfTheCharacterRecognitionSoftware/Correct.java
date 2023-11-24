package com.codewars.kyu8.correctTheMistakesOfTheCharacterRecognitionSoftware;

/**
 * Character recognition software is widely used to digitise printed texts. Thus the texts can be edited, searched
 * and stored on a computer.
 * <p>
 * When documents (especially pretty old ones written with a typewriter), are digitised character recognition
 * softwares often make mistakes.
 * <p>
 * Your task is correct the errors in the digitised text. You only have to handle the following mistakes:
 * <p>
 * S is misinterpreted as 5<br/>
 * O is misinterpreted as 0<br/>
 * I is misinterpreted as 1<br/>
 * The test cases contain numbers only by mistake.
 */
public class Correct {
    public static String correct(String string) {
        return string.replace("5", "S")
            .replace("0", "O")
            .replace("1", "I");
    }
}
