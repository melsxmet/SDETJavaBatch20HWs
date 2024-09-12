package org.example.e184;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class E184List {
}

class E184CountryList {
    public static List<String> removeCountriesStartingWithA(List<String> countries) {
        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()) {
            String country = iterator.next();
            if (country.startsWith("A")) {
                iterator.remove();
            }
        }
        return countries;
    }

    public static void main(String[] args) {
        List<String> countryList = new ArrayList<>();
        countryList.add("USA");
        countryList.add("Argentina");
        countryList.add("Kazakhstan");
        countryList.add("Australia");
        countryList.add("Pakistan");
        countryList.add("Russia");
        List<String> updatedList = removeCountriesStartingWithA(countryList);
        System.out.println(updatedList);
    }
}