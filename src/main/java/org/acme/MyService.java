package org.acme;


import javax.enterprise.context.ApplicationScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class MyService {

    private static final Logger logger = LoggerFactory.getLogger(MyService.class);
    
    public void createLog() {
        logger.info("Executing service. Log created by Logger");
    }
    public void createLog(String msg) {
        logger.info("Executing service. Log with param created by Logger"+ msg);
    }

}