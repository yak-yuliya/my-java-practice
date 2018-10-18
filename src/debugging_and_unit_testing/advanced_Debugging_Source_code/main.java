package debugging_and_unit_testing.advanced_Debugging_Source_code;

public class main {

    public static void main(String[] args) {
        StringUtilities utils = new StringUtilities();
        StringBuilder sb = new StringBuilder();
        while (sb.length() < 10) {
            utils.addChar(sb, 'a');
        }
        System.out.println(sb);

        String str = "abcdefg";
        String result = utils.upperAndPrefix(utils.addSuffix(str));

    }
}
