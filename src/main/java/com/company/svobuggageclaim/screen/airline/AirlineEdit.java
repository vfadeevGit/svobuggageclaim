package com.company.svobuggageclaim.screen.airline;

import io.jmix.ui.screen.*;
import com.company.svobuggageclaim.entity.Airline;

@UiController("Airline.edit")
@UiDescriptor("airline-edit.xml")
@EditedEntityContainer("airlineDc")
public class AirlineEdit extends StandardEditor<Airline> {
}