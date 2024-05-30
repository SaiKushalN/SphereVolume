package com.example.foo.service;

import org.springframework.stereotype.Service;

@Service
public interface VolumeService {
    double calculateVolume(double radius);
}
