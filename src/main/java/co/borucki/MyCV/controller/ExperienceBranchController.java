package co.borucki.MyCV.controller;

import co.borucki.MyCV.dto.ExperienceBranchDTO;
import co.borucki.MyCV.service.ExperienceBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/api/experience/branch")
public class ExperienceBranchController {
    @Autowired
    private ExperienceBranchService service;

    @RequestMapping(value = "/all", method = GET)
    public List<ExperienceBranchDTO> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "/create", method = POST)
    public ExperienceBranchDTO create(@RequestBody ExperienceBranchDTO experienceBranchDTO) {
        return service.create(experienceBranchDTO);
    }
}
