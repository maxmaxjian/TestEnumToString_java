public class Solution {

    public enum MY_ENUM {
        MY_ENUM_ON, MY_ENUM_OFF
    }


    public static void main(String[] args) {
        MY_ENUM myEnum = MY_ENUM.MY_ENUM_ON;
        System.out.println(MY_ENUM.MY_ENUM_ON.name());
        System.out.println(MY_ENUM.MY_ENUM_OFF.toString());
    }

}
