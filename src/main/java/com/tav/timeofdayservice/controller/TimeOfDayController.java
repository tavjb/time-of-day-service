package com.tav.timeofdayservice.controller;

import com.tav.timeofdayservice.dto.TimeOfDayWrapper;
import com.tav.timeofdayservice.service.TimeOfDayService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("time-of-day")
@RestController
@RequiredArgsConstructor
public class TimeOfDayController {
    private final TimeOfDayService timeOfDayService;

    @GetMapping
    public TimeOfDayWrapper get() {
        return timeOfDayService.get();
    }
}
