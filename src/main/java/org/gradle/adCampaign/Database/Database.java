package org.gradle.adCampaign.Database;

import java.util.HashMap;
import java.util.Map;

import org.gradle.adCampaign.Model.AdData;

public class Database {
		
	private static Map<Long,AdData> adsData = new HashMap<>();
	
	public static Map<Long,AdData> getAdsData(){
		return adsData;
	}
}
