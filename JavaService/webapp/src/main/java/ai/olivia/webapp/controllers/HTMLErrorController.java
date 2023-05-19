package ai.olivia.webapp.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static ai.olivia.webapp.utilities.Constant.ERROR_PATH;
import static ai.olivia.webapp.utilities.Constant.ERROR_HTML;

@Controller
public class HTMLErrorController implements ErrorController {
    @GetMapping(ERROR_PATH)
    public String handleError() {
        return ERROR_HTML;
    }
}

