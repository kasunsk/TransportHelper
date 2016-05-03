package com.kasun.app.transport.application.common.adapter;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

/**
 * Created by kasunk on 5/3/16.
 */
public abstract class AbstractDtoModelAdapter<MODEL, DTO> {

    private Class<MODEL> modelClass;
    private Class<DTO> dtoClass;
    ModelMapper modelMapper = new ModelMapper();
    ModelMapper dtoMapper = new ModelMapper();

    public AbstractDtoModelAdapter(Class<MODEL> modelClass, Class<DTO> dtoClass) {
        this.modelClass = modelClass;
        this.dtoClass = dtoClass;
        this.modelMapper.addMappings(this.fromModelMappings());
        this.dtoMapper.addMappings(this.fromDtoMappings());
    }

    public DTO fromModel(MODEL document) {

        DTO dto = null;
        if(document != null) {
            dto = modelMapper.map(document, dtoClass);
        }
        return dto;
    }

    public MODEL fromDto(DTO dto) {

        MODEL doc = null;
        if(dto != null) {
            doc = dtoMapper.map(dto, modelClass);
        }
        return doc;
    }



    protected abstract PropertyMap<MODEL, DTO> fromModelMappings();

    protected abstract PropertyMap<DTO, MODEL> fromDtoMappings();
}
