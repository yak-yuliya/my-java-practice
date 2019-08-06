package streams;

public class Streams {


//    public List<DemandPartnersTable> getDemandPartnersTableFromUI() {
//        waitElement.waitToBeVisible(listOfDemandPartnersTable);
//        return  webElementHelper.getTable(listOfDemandPartnersTable)
//                .stream()
//                .filter(list -> list.size() > 1)
//                .map(DemandPartnersTable::new)
//                .collect(Collectors.toList());
//    }
//
//
//    public void checkIfThePreviousDSPIsInTheList(DemandPartnersTable expectedDsp) {
//        waitElement.waitToBeVisible(listOfDemandPartnersTable);
//        List<List<String>> table = webElementHelper.getTable(listOfDemandPartnersTable);
//        List<DemandPartnersTable> tableConverted = table.stream()
//                .map(DemandPartnersTable::new)
//                .collect(Collectors.toList());
//        tableHelper.verifyIfARowIsPresent(expectedDsp, tableConverted);
//    }
//
//    public List<String> getWebTableHeader() {
//        waitElement.waitToBeVisible(headerTable);
//        return webElementHelper.getHeader(headerTable)
//                .stream()
//                .map(WebElement::getText)
//                .collect(Collectors.toList());
//    }
//
//    @And("^I see only the records which respect the filter criteria: \'(.*)\'$")
//    public void checkIfTheTableIsFiltered(final String searchText, final List<DemandPartnersTable> demandPartnersTableList) {
//        List<DemandPartnersTable> filteredExpectedTable = demandPartnersTableList
//                .stream()
//                .filter(it -> it.contains(searchText))
//                .collect(Collectors.toList());
//        assertEquals(manageDemandPartnersPage.getDemandPartnersTableFromUI(), filteredExpectedTable,
//                String.format("The actual table: %s cannot match the expected table: %s!", manageDemandPartnersPage.getDemandPartnersTableFromUI(), filteredExpectedTable));
//    }
//
//    @Then("^I see only the floor prices filtered by (.*) with the filter (.*) and sorted (.*) by (.*) column$")
//    public void checkIfTheTableIsFiltered(final String filterColumn, final String filterValue, final SortingStatus sortingOrder, final String sortingColumn, final List<InventoryTable> expectedTable) {
//        List<InventoryTable> expectedTableFiltered = expectedTable.stream()
//                .filter(it -> it.getValueOfField(filterColumn) == filterValue)
//                .collect(Collectors.toList());
//        dashboardPage.verifyTheSortTable(expectedTableFiltered, sortingOrder.sort(), sortingColumn);
//    }
//
//
//    @Override
//    public String get() {
//        if (threadSpecificHost.get() != null) {
//            return threadSpecificHost.get();
//        }
//
//        final String firstAvailableHost;
//        synchronized (availableTargetHosts) {
//            firstAvailableHost = availableTargetHosts
//                    .stream()
//                    .findFirst()
//                    .orElseThrow(() -> new IllegalStateException("more test threads are running than the number of target machines specified"));
//            availableTargetHosts.remove(firstAvailableHost);
//        }
//        threadSpecificHost.set(firstAvailableHost);
//
//        return firstAvailableHost;
//    }
//
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


}
