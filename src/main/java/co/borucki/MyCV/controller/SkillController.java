package co.borucki.MyCV.controller;

import co.borucki.MyCV.dto.SkillDTO;
import co.borucki.MyCV.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/api/skill")
public class SkillController {
    @Autowired
    private SkillService service;

    @RequestMapping(value = "/all", method = GET)
    public List<SkillDTO> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "/create", method = POST)
    public SkillDTO create(@RequestBody SkillDTO skillDTO) {
        return service.create(skillDTO);
    }
}
