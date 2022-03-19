package entities;

import abstracts.Entity;

public class Sales implements Entity {
    private int id;
    private int gameId;
    private  int campaignId;
    private  double unitPrice;
    private int gamerId;



    public Sales(int id, int gameId, int campaignId, double unitPrice,int gamerId) {
        this.id = id;
        this.gameId = gameId;
        this.campaignId = campaignId;
        this.unitPrice = unitPrice;
        this.gamerId=gamerId;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getGamerId() {
        return gamerId;
    }

    public void setGamerId(int gamerId) {
        this.gamerId = gamerId;
    }

}
