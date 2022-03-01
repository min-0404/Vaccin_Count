package CoronaProject.vaccinated.controller;

import CoronaProject.vaccinated.domain.VaccinatedData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class VaccinatedController {

    @GetMapping("/main")
    public String getMain(){
        return "main";
    }

    @PostMapping("/first_result")
    public String getFirst(@RequestBody VaccinatedData vaccinatedData, Model model){
        model.addAttribute("accumulatedFirstCnt", vaccinatedData.getAccumulatedFirstCnt());
        model.addAttribute("firstCnt", vaccinatedData.getFirstCnt());
        return "first_vaccin";
    }

    @PostMapping("/second_result")
    public String getSecond(@RequestBody VaccinatedData vaccinatedData, Model model){
        model.addAttribute("accumulatedSecondCnt", vaccinatedData.getAccumulatedSecondCnt());
        model.addAttribute("secondCnt", vaccinatedData.getSecondCnt());
        return "second_vaccin";
    }

    @PostMapping("/third_result")
    public String getThird(@RequestBody VaccinatedData vaccinatedData, Model model){
        model.addAttribute("accumulatedThirdCnt", vaccinatedData.getAccumulatedThirdCnt());
        model.addAttribute("thirdCnt", vaccinatedData.getThirdCnt());
        return "third_vaccin";
    }
}
