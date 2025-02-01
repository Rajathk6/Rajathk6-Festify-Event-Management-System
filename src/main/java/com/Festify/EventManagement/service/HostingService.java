package com.Festify.EventManagement.service;



import org.springframework.stereotype.Service;

import com.Festify.EventManagement.model.EventHostDatabase;
import com.Festify.EventManagement.repository.EventHostingRepository;

@Service
public class HostingService {
    EventHostingRepository eventhostrepo;

    public HostingService(EventHostingRepository eventhostrepo) {
        this.eventhostrepo = eventhostrepo;
    }

    public void addEventdetails(EventHostDatabase hostdata) {
        eventhostrepo.save(hostdata);
    }
}
