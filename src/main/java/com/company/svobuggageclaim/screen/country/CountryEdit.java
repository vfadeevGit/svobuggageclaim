package com.company.svobuggageclaim.screen.country;

import io.jmix.ui.screen.*;
import com.company.svobuggageclaim.entity.Country;

@UiController("Country.edit")
@UiDescriptor("country-edit.xml")
@EditedEntityContainer("countryDc")
public class CountryEdit extends StandardEditor<Country> {
}