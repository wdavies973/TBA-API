package com.cpjd.models;

public class Event {
	public String key;
	public String name;
	public String short_name;
	public String event_code;
	public String event_type_string;
	public long event_type;
	public String event_district_string;
	public long event_district;
	public long year;
	public long week;
	public String location;
	public String venue_address;
	public String timezone;
	public String website;
	public String start_date;
	public boolean official;
	
	/** The following values are set depending on the configuration set up in the Settings class.**/
	public Webcast[] webcasts;
	public Alliance[] alliances;
	
	/**
	 * If Settings.FIND_TEAM_RANKINGS is enabled, Team[] teams will be sorted by rank, where teams[0] is the best team
	 * and teams[teams.length-1] is the worst team.
	 */
	public Team[] teams;
	public Match[] matches;
	public Award[] awards;
	
	public class Webcast {
		public String type;
		public String channel;
	}
	
	public class Alliance {
		public String[] picks;
		public String[] declines;
		public String backupIn;
		public String backupOut;
		public String name;
	}
}
