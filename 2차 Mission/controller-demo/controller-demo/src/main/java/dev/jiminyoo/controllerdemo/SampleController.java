package dev.jiminyoo.controllerdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("view")
public class SampleController {
    private static final Logger logger
            = LoggerFactory.getLogger(SampleController.class);

    @GetMapping("/sample-jsp")
    public String sampleJsp(Model model)  {
        logger.info("in sample jsp");
        List<SamplePlayload> profiles = new ArrayList<>();
        profiles.add(new SamplePlayload("Adam", 22, "Student"));
        profiles.add(new SamplePlayload("Bradley", 29, "Accountant"));
        profiles.add(new SamplePlayload("Adam", 35, "Developer"));

        model.addAttribute("profiles", profiles);

        return "view-jsp";
    }

    @GetMapping("/sample-thyme")
    public ModelAndView sampleThyme() {
        logger.info("in sample thyme");
        ModelAndView modelAndView = new ModelAndView();
        List<SamplePlayload> profiles = new ArrayList<>();
        profiles.add(new SamplePlayload("Adam", 22, "Student"));
        profiles.add(new SamplePlayload("Bradley", 29, "Accountant"));
        profiles.add(new SamplePlayload("Adam", 35, "Developer"));

        modelAndView.addObject("profiles", profiles);
        modelAndView.setViewName("view-thyme");
        return modelAndView;
    }

}
