package com.company.svobuggageclaim.screen.pirclaim;

import io.jmix.ui.screen.*;
import com.company.svobuggageclaim.entity.PIRClaim;

@UiController("PIRClaim.browse")
@UiDescriptor("pir-claim-browse.xml")
@LookupComponent("pIRClaimsTable")
public class PIRClaimBrowse extends StandardLookup<PIRClaim> {
}