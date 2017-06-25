package com.spring.data.customs.auditing;

import org.springframework.data.domain.AuditorAware;

/**
 * Created by Ghazi Naceur on 25/06/2017.
 */
public class CustomAuditorAware implements AuditorAware<String> {
    @Override
    public String getCurrentAuditor() {
        return "A hunter";
    }
}
