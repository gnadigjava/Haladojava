import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import calculator.model.CalculatorModel;
import calculator.service.CalculatorService;

@Controller
public class CalculatorController {

    CalculatorModel calculatorModel = new CalculatorModel();

    @Autowired
    private CalculatorService calculatorService;

    @RequestMapping(value = "/")
    public String getCalculatorPage(Model model) {
        model.addAttribute("calculatorModel", calculatorModel);
        return "calculator";
    }

    @RequestMapping(value = "/", params = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute("calculatorModel") CalculatorModel calculatorModel, Model model) {
        model.addAttribute("result", calculatorService.add(calculatorModel));
        return "calculator";
    }

    @RequestMapping(value = "/", params = "subtract", method = RequestMethod.POST)
    public String subtract(@ModelAttribute("calculatorModel") CalculatorModel calculatorModel, Model model) {
        model.addAttribute("result", calculatorService.subtract(calculatorModel));
        return "calculator";
    }

    @RequestMapping(value = "/", params = "multiply", method = RequestMethod.POST)
    public String multiply(@ModelAttribute("calculatorModel") CalculatorModel calculatorModel, Model model) {
        model.addAttribute("result", calculatorService.multiply(calculatorModel));
        return "calculator";
    }

    @RequestMapping(value = "/", params = "divide", method = RequestMethod.POST)
    public String divide(@ModelAttribute("calculatorModel") CalculatorModel calculatorModel, Model model) {
        model.addAttribute("result", calculatorService.divide(calculatorModel));
        return "calculator";
    }

    @RequestMapping(value = "/", params = "reset", method = RequestMethod.POST)
    public String reset(@ModelAttribute("calculatorModel") CalculatorModel calculatorModel, Model model) {
        model.addAttribute("calculatorModel", calculatorService.reset(calculatorModel));
        model.addAttribute("result", 0);
        return "calculator";
    }

}