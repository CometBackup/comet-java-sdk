
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* ContentMeasurementComponent
*/
public class ContentMeasurementComponent {
	@JsonProperty("Bytes")
	public long Bytes;

	//A list of strings describing which groups of snapshots rely on reaching this component of data.
	//The strings may take the following formats:
	//- source_id/CURRENT - this data is required by the most recent backup job snapshot for the listed Protected Item
	//source.
	//- source_id/HISTORIC - this data is required by an older backup job snapshot for the listed Protected Item source.
	//- TRUNCATED/* - there are too many separate components to show, and this component represents data that is used by
	//some other combination of components. If present, it will be the only entry in the UsedBy array.
	//- the empty string - this amount of data is not currently referenced by any backup job snapshots. If that remains the
	//case by the next retention pass, this much data will be deleted to free up space. If present, it will be the only
	//entry in the UsedBy array.
	@JsonProperty("UsedBy")
	public ArrayList<String> UsedBy;


	public ContentMeasurementComponent(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public ContentMeasurementComponent fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,ContentMeasurementComponent.class);
	}

}
