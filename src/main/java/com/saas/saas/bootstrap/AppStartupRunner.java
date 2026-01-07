package com.saas.saas.bootstrap;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppStartupRunner implements ApplicationRunner {

    private final BootstrapService bootstrapService;

    @Override
    public void run(ApplicationArguments args) {
        bootstrapService.bootstrap();
    }
}

