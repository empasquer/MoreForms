package com.example.moreforms.controllers;

import com.example.moreforms.models.TypeOfTravels;
import com.example.moreforms.models.VacationPreferences;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowPreferencesController {
    @PostMapping("/show-preferences")
    public String showPreferences(Model model, @RequestParam String name, @RequestParam String keywords,
                                  @RequestParam String destination, @RequestParam TypeOfTravels typeOfTravel,
                                  @RequestParam(name = "features") ArrayList<String> features) {


        VacationPreferences vacationPreferences = new VacationPreferences();

        vacationPreferences.setName(name);
        vacationPreferences.setKeywords(keywords);
        vacationPreferences.setDestination(destination);
        vacationPreferences.setTypeOfTravel(typeOfTravel);
        vacationPreferences.setFeatures(features);

        model.addAttribute(vacationPreferences);



        return "home/show-preferences";
    }
}
