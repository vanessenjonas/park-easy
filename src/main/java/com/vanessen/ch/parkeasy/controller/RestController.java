package com.vanessen.ch.parkeasy.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

import static com.vanessen.ch.parkeasy.controller.RestController.PATH;

/**
 * Created by Jonas van Essen on 05.02.2017.
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping(path = PATH)
@Api(value = "park-easy", description = "Park Easy API", tags = {"park-easy"})
public class RestController {

    private static Logger logger = LoggerFactory.getLogger(RestController.class);

    static final String PATH = "/v1";

    @RequestMapping(path= "/echo", method = RequestMethod.GET)
    @ApiOperation("Echo service")
    public String helloEcho(
            @RequestHeader(value = "Accept-Language", required = false) String acceptLanguage,
            @RequestParam(value = "language", required = false) Locale language,
            @RequestParam(value = "name" , required = true, defaultValue = "echo") String name
    ) throws Exception {

        return "Hello " + name;
    }

}
