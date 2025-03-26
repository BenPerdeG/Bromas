package com.example.broma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(BromaController.BROMA)
public class BromaController {
    public static final String BROMA = "/";

    @Autowired
    BromaService bromaService;

    @GetMapping("/bromaGeneral")
    public String bromaGeneral( Model model) {
        String broma = bromaService.getBromaGeneral();
        model.addAttribute("broma", broma);
        return "bromaGeneral";
    }
    @GetMapping("/bromaKnock")
    public String bromaKnock(Model model) {
        String broma = bromaService.getBromaKnock();
        model.addAttribute("broma", broma);
        return "bromaKnock";
    }
    @GetMapping("/bromaProgram")
    public String bromaProgram(Model model) {
        String broma = bromaService.getBromaProgramacion();
        model.addAttribute("broma", broma);
        return "bromaProgram";
    }
    @GetMapping("/bromaDad")
    public String bromaDad(Model model) {
        String broma = bromaService.getBromaPadre();
        model.addAttribute("broma", broma);
        return "bromaDad";
    }
}
