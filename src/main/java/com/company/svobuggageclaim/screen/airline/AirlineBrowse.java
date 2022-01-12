package com.company.svobuggageclaim.screen.airline;

import io.jmix.ui.screen.*;
import com.company.svobuggageclaim.entity.Airline;

@UiController("Airline.browse")
@UiDescriptor("airline-browse.xml")
@LookupComponent("airlinesTable")
public class AirlineBrowse extends StandardLookup<Airline> {
}