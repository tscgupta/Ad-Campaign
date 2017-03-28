package org.maven.adCampaign.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.gradle.adCampaign.Model.AdData;
import org.gradle.adCampaign.Service.AdDataService;

@Path("/ads")
public class AdResource {
	
	AdDataService adDataService = new AdDataService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<AdData> getAds(){
		return AdDataService.getAllAds();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public AdData addAdData(AdData adData){
		return adDataService.addAdData(adData);
	}
	
	@PUT
	@Path("/{partner_id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public AdData updateAdData(@PathParam("partner_id") long partner_id,AdData adData){
		adData.setPartner_id(partner_id);
		return adDataService.updateAdData(adData);
	}
	
	@DELETE
	@Path("/{partner_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteMessage(@PathParam("partner_id") long partner_id){
		adDataService.removeAdData(partner_id);
	}
	
	@GET
	@Path("/{partner_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public AdData getAdData(@PathParam("partner_id")long partner_id){
		
		return adDataService.getAdData(partner_id);
		
	}
	
	
}
