package com.example.foo.service.impl;

import com.example.foo.service.VolumeService;
import org.springframework.stereotype.Component;

import java.lang.Math.*;

@Component
public class VolumeServiceImpl implements VolumeService {
    @Override
    public double calculateVolume(double radius) {

        double value = (Math.pow(radius, 3)*((double) 4 /3)* Math.PI);
        double scale = Math.pow(10, 2);
        return Math.round(value * scale) / scale;
    }
}
