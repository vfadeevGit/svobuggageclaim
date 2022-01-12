package com.company.svobuggageclaim.screen.listofflight;

import io.jmix.ui.screen.*;
import com.company.svobuggageclaim.entity.ListOfFlight;

@UiController("ListOfFlight.edit")
@UiDescriptor("list-of-flight-edit.xml")
@EditedEntityContainer("listOfFlightDc")
public class ListOfFlightEdit extends StandardEditor<ListOfFlight> {
}