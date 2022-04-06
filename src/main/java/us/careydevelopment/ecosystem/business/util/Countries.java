package us.careydevelopment.ecosystem.business.util;

import us.careydevelopment.ecosystem.business.model.Country;
import us.careydevelopment.ecosystem.business.model.UsState;

import java.util.ArrayList;
import java.util.List;

public class Countries {

    private static List<Country> COUNTRIES = new ArrayList<>();

    static void set(List<Country> countries) {
        COUNTRIES = countries;
    }

    public static List<Country> get() {
        return COUNTRIES;
    }
}
