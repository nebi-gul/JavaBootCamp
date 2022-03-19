package abstracts;

import entities.Campaign;

public interface CampaingService {
    public void add(Campaign campaign);

    public void remove(Campaign campaign);

    public void update(Campaign campaign);
}
