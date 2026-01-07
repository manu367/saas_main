package com.saas.saas.bootstrap.service;

import com.saas.saas.bootstrap.BootstrapService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class BootstrapServiceImpl implements BootstrapService {
    @Override
    public void bootstrap() {

    }
}
