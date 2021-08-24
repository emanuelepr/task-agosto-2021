package com.teamsisalamarisep.taskagosto2021.api;

import com.teamsisalamarisep.taskagosto2021.model.Auto;
import com.teamsisalamarisep.taskagosto2021.service.AutoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("${project.main-endpoint01}")
@RestController
@AllArgsConstructor
public class AutoController {
    private final AutoService autoService;

    @GetMapping
    public List<Auto> getAllAuto(){
        return autoService.getAllAuto();
    }

    /*@GetMapping(path = "{id}")
    public Auto getAutoById(@PathVariable("id") UUID id) {
        return autoService.getAutoByID(id)
                .orElse(null);
    }

    @PostMapping
    public void addAuto(@RequestBody Auto auto){
        autoService.addAuto(auto);
    }

    @DeleteMapping(path = "{id}")
    public void deteleAutoByID(@PathVariable("id") UUID id){
        autoService.deleteAuto(id);
    }

    @PutMapping(path = "{id}")
    public void updateAuto(@PathVariable("id") UUID id, @RequestBody Auto autoToUpdate) {
        autoService.updateAuto(id, autoToUpdate);
    }*/
}
