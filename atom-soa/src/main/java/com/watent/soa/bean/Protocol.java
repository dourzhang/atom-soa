package com.watent.soa.bean;

import com.watent.soa.rmi.RmiUtil;
import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

import java.io.Serializable;

/**
 * 协议
 *
 * @author Atom
 */
@Data
public class Protocol implements Serializable, InitializingBean {

    private String name;

    private String host;

    private String port;

    private String contextpath;

    @Override
    public void afterPropertiesSet() throws Exception {
        if (name.equalsIgnoreCase("rmi")) {
            RmiUtil rmi = new RmiUtil();
            rmi.startRmiServer(host, port, "soarmi");
        }
    }
}
