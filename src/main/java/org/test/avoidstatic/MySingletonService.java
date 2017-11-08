package org.test.avoidstatic;

import org.springframework.stereotype.Component;

@Component
public class MySingletonService {

    public String getData() {
        return "BLAFOOBAR";
    }
}
