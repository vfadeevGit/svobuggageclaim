package com.company.svobuggageclaim.screen.pirclaim;

import io.jmix.ui.screen.*;
import com.company.svobuggageclaim.entity.PIRClaim;

@UiController("PIRClaim.edit")
@UiDescriptor("pir-claim-edit.xml")
@EditedEntityContainer("pIRClaimDc")
public class PIRClaimEdit extends StandardEditor<PIRClaim> {
}