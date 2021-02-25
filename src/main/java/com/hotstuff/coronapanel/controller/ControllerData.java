package com.hotstuff.coronapanel.controller;

import com.hotstuff.coronapanel.ServiceData;
import com.hotstuff.coronapanel.models.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ControllerData {
    @Autowired
    ServiceData serviceData;

    @GetMapping("/")
    public String home(Model model) {
        List<Location> allStats = serviceData.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        int totaNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedCases", totalReportedCases);
        model.addAttribute("totalNewCases", totaNewCases);


        return "home";
    }

}
