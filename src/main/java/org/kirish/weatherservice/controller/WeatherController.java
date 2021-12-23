package org.kirish.weatherservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/weather")
public class WeatherController {

    @GetMapping
    @ResponseBody
    public String weatherInfo() {
        return "{\"status\": \"ok\"}";
    }
}
