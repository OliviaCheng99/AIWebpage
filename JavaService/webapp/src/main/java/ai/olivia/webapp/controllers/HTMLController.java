package ai.olivia.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static ai.olivia.webapp.utilities.Constant.EXAMPLE_HTML;
import static ai.olivia.webapp.utilities.Constant.EXAMPLE_PATH;
import static ai.olivia.webapp.utilities.Constant.INDEX_HTML;
import static ai.olivia.webapp.utilities.Constant.INDEX_PATH;

@Controller
public class HTMLController {
    @GetMapping(INDEX_PATH)
    public String index() {
        return INDEX_HTML;
    }

    @GetMapping(EXAMPLE_PATH)
    public String example(final Model model) {
        model.addAttribute("message", "Welcome to the Spring Boot MVC example!");
        return EXAMPLE_HTML;
    }
}
