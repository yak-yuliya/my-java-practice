package dataCollections;

public class MainUsingTwoDimentionalArrays {

    public static void main(String[] args) {
        String[][] table = new String[3][2];
        table[0][0] = "California";
        table[0][1] = "Sacramento";
        table[1][0] = "Oregon";
        table[1][1] = "Salem";
        table[2][0] = "Washington";
        table[2][1] = "Olympia";

        for (int i = 0; i < table.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The capital of ")
                    .append(table[i][0])
                    .append(" is ")
                    .append(table[i][1])
            .append(".");
            System.out.println(sb);
        }

    }
}
