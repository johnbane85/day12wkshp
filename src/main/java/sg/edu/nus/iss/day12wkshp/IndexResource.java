package sg.edu.nus.iss.day12wkshp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = { "/indexresource", "indexresource.html" })
public class IndexResource {

  @GetMapping(produces = { "tesx/html" })
  public String index(Model model) {
    return "indexresource";
  }

}
