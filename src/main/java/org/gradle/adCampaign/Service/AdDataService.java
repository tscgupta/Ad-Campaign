package org.gradle.adCampaign.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.gradle.adCampaign.Database.Database;
import org.gradle.adCampaign.Model.AdData;

public class AdDataService {
		private static Map<Long, AdData> adsData = Database.getAdsData();
		
		public AdDataService(){
			adsData.put(1L,new AdData(1L,10,"Facebook"));
			adsData.put(2L,new AdData(2L,20,"Messenger"));
		}
		
		public static  List<AdData> getAllAds(){
			return new ArrayList<AdData>(adsData.values());
		}
		
		public AdData getAdData(long partner_id){
			return adsData.get(partner_id);
		}
		
		public AdData addAdData(AdData adData){
			adData.setPartner_id(adsData.size()+ 1);
			adsData.put(adData.getPartner_id(), adData);
			return adData;
		}
		
		public AdData updateAdData(AdData adData){
			if(adData.getPartner_id() <= 0){
				return null;
			}
			adsData.put(adData.getPartner_id(), adData);
			return adData;
		}
		
		public AdData removeAdData(long partner_id){
			return adsData.remove(partner_id);
		}
}
