package objectFundamentals.business.abstracts;

import objectFundamentals.entity.concretes.Campaign;

public interface CampaigneService {
    void  add(Campaign campaign);
    void  update(Campaign campaign);
    void  delete(Campaign campaign);
    boolean validUser();
}
