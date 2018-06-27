package org.tact.base.rest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tact.config.ServerProperties;


@RestController
@RequestMapping(value = "/base")
public class BaseController {
	
	@Autowired
    private ServerProperties serverProperties;
	
    @RequestMapping(value = "", method = RequestMethod.GET)
    public <T> T listUsers() {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("one", "two");
        map.put("three", "four");
        map.put("five", "six");
        map.put("seven", "eight");
        
        String email  = serverProperties.getEmail();
        String webKey = serverProperties.getApp_web_key();
        
        map.put("email", email);
        map.put("webkey", webKey);
        
        return (T) map;
    }
}
