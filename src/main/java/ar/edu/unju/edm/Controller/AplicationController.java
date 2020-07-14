package ar.edu.unju.edm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AplicationController {
	@GetMapping("/home")
	public String iniciarApp() {
		return "Index";
	}
	@GetMapping("/fixture")
	public String mostrarFixture() {
		return "fixture";
	}
	
}
