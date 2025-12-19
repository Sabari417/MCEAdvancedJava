package edu.mce.sabariraj.mobileshop.interfaces;

import edu.mce.sabariraj.mobileshop.models.Mobile;
import java.util.List;

public interface MobileCRUD {
        int createMobile (Mobile mobile);
        List<Mobile> readMobiles();
        int updateMobile (Mobile mobile);
        int deleteMobile (Long id);
        Mobile readMobile (Long id);
}

