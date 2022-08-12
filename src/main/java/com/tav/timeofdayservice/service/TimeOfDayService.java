package com.tav.timeofdayservice.service;

import com.tav.timeofdayservice.config.TimeOfDayConfig;
import com.tav.timeofdayservice.dto.TimeOfDayWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
@RequiredArgsConstructor
public class TimeOfDayService {
    private final TimeOfDayConfig config;

    public TimeOfDayWrapper get() {
        final Calendar time = Calendar.getInstance();

        final TimeOfDayWrapper todWrapper = new TimeOfDayWrapper();
        final int hour = time.get(Calendar.HOUR_OF_DAY);

        if (hour >= config.getEveningThreshold()) {
            todWrapper.setTimeOfDay("evening");
        } else if (hour >= config.getAfternoonThreshold()) {
            todWrapper.setTimeOfDay("afternoon");
        } else {
            todWrapper.setTimeOfDay("morning");
        }

        System.out.println("Finished calculating time of day!");
        return todWrapper;
    }
}

