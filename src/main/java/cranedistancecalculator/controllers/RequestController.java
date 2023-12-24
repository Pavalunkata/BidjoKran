package cranedistancecalculator.controllers;

import cranedistancecalculator.DistanceMassTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestController {
    @RequestMapping(value = "/",
            method = RequestMethod.GET)
    @ResponseBody
    public String index(@RequestParam(name = "distance", required = false) Double distance,
                           @RequestParam(name = "height", required = false) Double height) {
        if (distance != null && height != null) {
            double mass = DistanceMassTable.massLimit(distance, height);
            return String.format("Максимално тегло: %.01f тона", mass);
        }
        else {
            return "index";
        }
    }
    @RequestMapping(value = "/error",
            method = RequestMethod.GET)
    @ResponseBody
    //@GetMapping("/error")
    public String error(){
        return "404";
    }

}
