package com.example.gmk.Controllers;

import com.example.gmk.Services.DataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class databaseController {
    @Autowired
    private DataBaseService databaseservices;

    @GetMapping("/databaseStatus")
    public String databaseStatus(Model model){
        boolean isDBConnection = databaseservices.isDBConnection();
        model.addAttribute("isDBConnection", isDBConnection);
        return "databaseStatus";
    }
}
