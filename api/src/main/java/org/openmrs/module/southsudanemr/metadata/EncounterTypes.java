package org.openmrs.module.southsudanemr.metadata;

import org.openmrs.module.metadatadeploy.descriptor.EncounterTypeDescriptor;

public class EncounterTypes {
	
	public static EncounterTypeDescriptor ART_INITIAL_ENCOUNTER_TYPE = new EncounterTypeDescriptor() {
		
		@Override
		public String name() {
			return "ART enrollment";
		}
		
		@Override
		public String description() {
			return "Used for collecting information related to ART enrollment";
		}
		
		@Override
		public String uuid() {
			return "22cc4ade-39dc-11e9-bd8d-23b7f6ce3c7f";
		}
	};
	
	public static EncounterTypeDescriptor ART_FOLLOW_UP_ENCOUNTER_TYPE = new EncounterTypeDescriptor() {
		
		@Override
		public String name() {
			return "ART Follow up";
		}
		
		@Override
		public String description() {
			return "Used for collecting follow up information related to ART care";
		}
		
		@Override
		public String uuid() {
			return "a0f58114-39dc-11e9-aa78-57fcaf14551d";
		}
	};
	
	public static EncounterTypeDescriptor ART_DISCONTINUES_ENCOUNTER_TYPE = new EncounterTypeDescriptor() {
		
		@Override
		public String name() {
			return "ART Discontinuation";
		}
		
		@Override
		public String description() {
			return "Used for exiting a patient from the  ART care";
		}
		
		@Override
		public String uuid() {
			return "99bc1bf6-3a81-11e9-818d-ebe91c104547";
		}
	};
	
	public static EncounterTypeDescriptor VITALS_ENCOUNTER_TYPE = new EncounterTypeDescriptor() {
		
		@Override
		public String name() {
			return "Milestones at Start of ART";
		}
		
		@Override
		public String description() {
			return "Used for exiting a patient from the  ART care";
		}
		
		@Override
		public String uuid() {
			return "aa1e3904-4718-11e9-91ef-63f7c2d6eed0";
		}
	};
	
	public static EncounterTypeDescriptor TREATMENT_INTERRUPTION_ENCOUNTER_TYPE = new EncounterTypeDescriptor() {
		
		@Override
		public String name() {
			return "ART Treatment Interruption Type";
		}
		
		@Override
		public String description() {
			return "Used for ART Treatment Interruption form";
		}
		
		@Override
		public String uuid() {
			return "e128dbb6-4961-11e9-b5bc-b381a71e44de";
		}
	};
}
