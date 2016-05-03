package com.kasun.app.transport.carpool.logic;

import com.kasun.app.transport.application.api.carpool.dto.Carpool;
import com.kasun.app.transport.application.common.genaric.util.StatelessServiceLogic;
import com.kasun.app.transport.carpool.adapter.CarpoolDtoModelAdapter;
import com.kasun.app.transport.carpool.dao.CarpoolDao;
import com.kasun.app.transport.carpool.model.CarpoolEntity;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by kasunk on 5/3/16.
 */
public class CarpoolCreationLogic extends StatelessServiceLogic<Carpool, Carpool> {

    private CarpoolDao<CarpoolEntity> carpoolDao;
    private CarpoolDtoModelAdapter carpoolDtoModelAdapter = new CarpoolDtoModelAdapter();

    @Override
    public Carpool invoke(Carpool carpool) {

        validateCarpool(carpool);
        CarpoolEntity carpoolEntity = carpoolDao.save(carpoolDtoModelAdapter.fromDto(carpool));
        return carpoolDtoModelAdapter.fromModel(carpoolEntity);
    }

    private void validateCarpool(Carpool carpool) {

        if (carpool.getOwner() == null) {
            throw new RuntimeException("Owner name is null");
        }
    }

    @Required
    public void setCarpoolDao(CarpoolDao<CarpoolEntity> carpoolDao) {
        this.carpoolDao = carpoolDao;
    }
}
