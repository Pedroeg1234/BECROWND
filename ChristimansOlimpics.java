import java.util.Scanner;

public class ChristimansOlimpics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxCountries = 300;
        int maxMedals = 3; // Gold, Silver, Bronze
        int[][] medalTable = new int[maxCountries][maxMedals];

        while (scanner.hasNext()) {
            String competition = scanner.nextLine();
            if (competition.equals("0")) {
                break;
            }
            String gold = scanner.nextLine();
            String silver = scanner.nextLine();
            String bronze = scanner.nextLine();

            updateMedals(medalTable, gold, 0); // Gold
            updateMedals(medalTable, silver, 1); // Silver
            updateMedals(medalTable, bronze, 2); // Bronze
        }

        printMedalTable(medalTable);
    }

    private static void updateMedals(int[][] medalTable, String countryName, int medalType) {
        int countryIndex = findCountryIndex(medalTable, countryName);
        medalTable[countryIndex][medalType]++;
    }

    private static int findCountryIndex(int[][] medalTable, String countryName) {
        for (int i = 0; i < medalTable.length; i++) {
            if (medalTable[i][0] == 0 && medalTable[i][1] == 0 && medalTable[i][2] == 0) {
                // Found an empty slot for a new country
                medalTable[i][0] = 1; // Mark as visited
                return i;
            } else if (countryName.equals(getCountryName(medalTable, i))) {
                return i;
            }
        }
        return -1; // Should not reach here
    }

    private static String getCountryName(int[][] medalTable, int index) {
        // Assuming the country name is stored in the first column
        return String.valueOf((char) ('A' + index));
    }

    private static void printMedalTable(int[][] medalTable) {
        System.out.println("Quadro de Medalhas");

        for (int i = 0; i < medalTable.length; i++) {
            String countryName = getCountryName(medalTable, i);
            int gold = medalTable[i][0];
            int silver = medalTable[i][1];
            int bronze = medalTable[i][2];
            if (gold + silver + bronze > 0) {
                System.out.println(countryName + " " + gold + " " + silver + " " + bronze);
            }
        }
    }
}
