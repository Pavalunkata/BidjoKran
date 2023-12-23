package cranedistancecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class BidjoKranApplication {
	public static void main(String[] args) {
		SpringApplication.run(BidjoKranApplication.class, args);
	}
	
	@GetMapping("/distance")
	public String distance(@RequestParam(name = "distance", required = false) Double distance,
						   @RequestParam(name = "height", required = false) Double height) {
		if (distance != null && height != null) {
			double mass = distanceMassTable.massLimit(distance, height);
			return "" + mass;
		} else {
			return "index";
		}


	}

}
