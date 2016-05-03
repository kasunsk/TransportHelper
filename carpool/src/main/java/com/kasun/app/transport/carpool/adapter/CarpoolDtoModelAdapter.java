package com.kasun.app.transport.carpool.adapter;

import com.kasun.app.transport.application.api.carpool.dto.Carpool;
import com.kasun.app.transport.application.common.adapter.AbstractDtoModelAdapter;
import com.kasun.app.transport.carpool.model.CarpoolEntity;
import org.modelmapper.PropertyMap;

/**
 * Created by kasunk on 5/3/16.
 */
public class CarpoolDtoModelAdapter extends AbstractDtoModelAdapter<CarpoolEntity, Carpool> {

    public CarpoolDtoModelAdapter() {
        super(CarpoolEntity.class, Carpool.class);
    }

    @Override protected PropertyMap<CarpoolEntity, Carpool> fromModelMappings() {
        return new PropertyMap<CarpoolEntity, Carpool>() {
            @Override protected void configure() {

            }
        };
    }

    @Override protected PropertyMap<Carpool, CarpoolEntity> fromDtoMappings() {
        return new PropertyMap<Carpool, CarpoolEntity>() {
            @Override protected void configure() {

            }
        };
    }
}
