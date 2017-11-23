package com.watent.provider.frameworkservice;


import org.springframework.stereotype.Service;

@Service
public class FrameworkTestServiceImpl implements FrameworkTestService {

    @Override
    public String sleep(String param) {

        String str = "Provider ->FrameworkTestServiceImpl->sleep:" + param;
        System.out.println(str);
        return str;
    }
}
