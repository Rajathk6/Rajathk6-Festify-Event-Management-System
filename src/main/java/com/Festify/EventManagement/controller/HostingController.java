package com.Festify.EventManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Festify.EventManagement.model.EventHostDatabase;
import com.Festify.EventManagement.service.HostingService;

@Controller
@RequestMapping("/eventhosting")
public class HostingController {
    HostingService EventHostService;
    HostingService VenueHostService;

    public HostingController(HostingService EventHostService, HostingService VenueHostService) {
        this.EventHostService = EventHostService;
        this.VenueHostService = VenueHostService;
    }

    @PostMapping("/submit")
    public String getEvent(@ModelAttribute EventHostDatabase hostdata) {
        EventHostService.addEventdetails(hostdata);
        return "redirect:/eventhosting";
    }
}
