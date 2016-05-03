package com.kasun.app.transport.carpool.controller;

import com.kasun.app.transport.application.api.carpool.dto.Carpool;
import com.kasun.app.transport.application.api.carpool.service.CarpoolService;
import com.kasun.app.transport.application.common.genaric.ServiceRequest;
import com.kasun.app.transport.carpool.dto.CarpoolParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by kasunk on 5/3/16.
 */
@Controller
@RequestMapping("carpool")
public class CarpoolController {

    @Autowired
    private CarpoolService carpoolService;

    @RequestMapping(value = "/create", method = RequestMethod.POST,
            consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
    public @ResponseBody void createCarpool(@RequestBody CarpoolParam carpoolParam) {

        Carpool carpool =  new Carpool();
        carpool.setOwner(2L);
        carpoolService.createCarpool(new ServiceRequest<>(carpool));
    }
}
