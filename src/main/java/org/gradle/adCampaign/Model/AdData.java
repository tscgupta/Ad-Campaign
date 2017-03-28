package org.gradle.adCampaign.Model;

public class AdData {
		
	private long partner_id;
	private long duration;
	private String ad_content;
	
	public AdData(){
		
	}
	public AdData(long partner_id, long duration, String ad_content) {
		super();
		this.partner_id = partner_id;
		this.duration = duration;
		this.ad_content = ad_content;
	}

	public long getPartner_id() {
		return partner_id;
	}
	
	public void setPartner_id(long partner_id) {
		this.partner_id = partner_id;
	}
	
	public long getDuration() {
		return duration;
	}
	
	public void setDuration(long duration) {
		this.duration = duration;
	}
	
	public String getAd_content() {
		return ad_content;
	}
	
	public void setAd_content(String ad_content) {
		this.ad_content = ad_content;
	}
	
	
	
}
