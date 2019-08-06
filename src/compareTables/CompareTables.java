package compareTables;

public class CompareTables {

//    public void compareCountryTable(List<String> countries) {
//        webElementHelper.scrollToElement(countriesTable);
//        List<List<String>> tableOfCheckBoxAndCountry = webElementHelper.getTable(countriesTable);
//        List<String> countriesFromTable = getCountriesFromTable(tableOfCheckBoxAndCountry);
//        boolean isAllCountriesEqual = true;
//        boolean isSizeEquals = (tableOfCheckBoxAndCountry.size() == countries.size());
//        if (isSizeEquals) {
//            for (int i = 0; i < countries.size(); i++) {
//                if (!countries.get(i).equals(countriesFromTable.get(i))) {
//                    isAllCountriesEqual = false;
//                }
//            }
//        } else {
//            isAllCountriesEqual = false;
//        }
//        if (!isAllCountriesEqual) {
//            throw new RuntimeException("Countries in countries targeting component do not match with previously populated countries! The countries populated are: " + tableOfCheckBoxAndCountry + " , but shall be " + countries);
//        }
//    }
//
//    private List<String> getCountriesFromTable(List<List<String>> tableOfCheckBoxAndCountry) {
//        List<String> countries = tableOfCheckBoxAndCountry.stream()
//                .map(item -> item.get(1))
//                .collect(Collectors.toList());
//        return countries;
//    }
//
//    public void compareCountryTableStream(List<String> countries) {
//        webElementHelper.scrollToElement(countriesTable);
//        List<List<String>> tableOfCheckBoxAndCountry = webElementHelper.getTable(countriesTable);
//        List<String> countriesFromTable = getCountriesFromTable(tableOfCheckBoxAndCountry);
//        //CollectionUtils.isEqualCollection(countries, countriesFromTable);
//        long numOfEqualCountries = countries.stream()
//                .filter(country -> countriesFromTable.contains(country))
//                .count();
//
//        if (numOfEqualCountries != countriesFromTable.size()) {
//            throw new RuntimeException("Countries in countries targeting component do not match with previously populated countries! The countries populated are: " + tableOfCheckBoxAndCountry + " , but shall be " + countries);
//        }
//

}
