package com.company.svobuggageclaim.screen.country;

import io.jmix.ui.screen.*;
import com.company.svobuggageclaim.entity.Country;

@UiController("Country.browse")
@UiDescriptor("country-browse.xml")
@LookupComponent("countriesTable")
public class CountryBrowse extends StandardLookup<Country> {
    @Subscribe
    public void onInit(InitEvent event) {

    }


}