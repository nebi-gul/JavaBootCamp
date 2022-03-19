package Entities;

import Abstracts.Entity;

public class Sales implements Entity{
	private int id;
	private int gameid;
	private int gamerid;
	private int campaingId;
	private double gamePrice;
	
	public Sales(int id, int gameid, int gamerid, int campaignId, double gamePrice) {
		this.id = id;
		this.gameid = gameid;
		this.gamerid = gamerid;
		this.campaingId = campaignId;
		this.gamePrice = gamePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameid() {
		return gameid;
	}

	public void setGameid(int gameid) {
		this.gameid = gameid;
	}

	public int getGamerid() {
		return gamerid;
	}

	public void setGamerid(int gamerid) {
		this.gamerid = gamerid;
	}
	
	public int getCampaignid() {
		return campaingId;
	}

	public void setCampaignid(int campaignId) {
		this.campaingId = campaignId;
	}
	
	public double getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
}
