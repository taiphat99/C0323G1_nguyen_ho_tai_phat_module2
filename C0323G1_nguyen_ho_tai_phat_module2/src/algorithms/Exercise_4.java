package algorithms;

public class Exercise_4 {

    public static void main(String[] args) {
        //-	Input: Hello CodeGym
        //Output: hello code gym
        //-	Input: DaNang
        //Output: da nang
        //-	Input: CodeGymDaNang
        //Output: code gym da nang
        //-	Input: CodeMarathon
        //Output: code marathon

        String str = "CodeGymDaNang";
        System.out.println(amendTheSentence(str));

    }

    public static String amendTheSentence(String str) {
        String finalStr = "";
        String[] charArr = str.split("");
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i].equals(charArr[i].toUpperCase())) {
                if (i != 0) {
                    finalStr += " " + charArr[i].toLowerCase();
                } else {
                    finalStr += charArr[i].toLowerCase();
                }
            } else {
                finalStr += charArr[i];
            }
        }
        return finalStr;
    }
}
