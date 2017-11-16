package co.borucki.MyCV.controller;

import co.borucki.MyCV.dto.ExperiencePeriodDTO;
import co.borucki.MyCV.service.ExperiencePeriodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/api/experience/period")
public class ExperiencePeriodController {
    @Autowired
    private ExperiencePeriodService service;

    @RequestMapping(value = "/all", method = GET)
    public List<ExperiencePeriodDTO> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "/create", method = POST)
    public ExperiencePeriodDTO create(@RequestBody ExperiencePeriodDTO experiencePeriodDTO) {
        return service.create(experiencePeriodDTO);
    }
}
