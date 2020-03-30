package io.javabrains.coronavirustracker.controllers;

import io.javabrains.coronavirustracker.modules.LocationStats;
import io.javabrains.coronavirustracker.services.CoronavirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.text.AttributedString;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronavirusDataService coronavirusDataService;

    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> allStats = coronavirusDataService.getAllStats();
        int totalReportCases = allStats.stream().mapToInt(stat -> {
            return stat.getLatestTotalCases();
        }).sum();
        int totalNewCases = allStats.stream().mapToInt(stat -> {
            return stat.getDiffFromPrevDay();
        }).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedCases", totalReportCases);
        model.addAttribute("totalNewCases", totalNewCases);
        return "home";
    }
}
