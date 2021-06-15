package objectFundamentals.business.concretes;

import objectFundamentals.business.abstracts.CampaigneService;
import objectFundamentals.entity.concretes.Campaign;

public class CampaigneManager implements CampaigneService {
    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " adlı kampanya sisteme eklendi.");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " adlı kampanyanın güncellemesi yapıldı.");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " adlı kampanya sistemden kaldırıldı.");
    }
}
