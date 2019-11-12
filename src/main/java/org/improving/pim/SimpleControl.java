package org.improving.pim;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SimpleControl {
    private ProductRepository productRepository = new ProductRepository();

    @RequestMapping(value="/index", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.put("item", new Inventory("", "", "", ""));
        //model.put("itemList", itemList());
        model.put("items", productRepository.getItems());
        return "index";
    }

    @PostMapping("/add")
    public String add(ModelMap model, @Valid @ModelAttribute("item") Inventory item, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            model.put("items", productRepository.getItems());
            return "index";
        }
        productRepository.add(item);
        return "redirect:/index";
    }
    @RequestMapping("/login")
    public String login() {
        return "Login";
    }

    @RequestMapping("/datacables")
    public String datacables() {
        return "datacables";
    }

    @RequestMapping("/form")
    public String form() {
        return "Form";
    }

    @RequestMapping("/car charger")
    public String carcharger() {
        return "car charger";
    }

    @RequestMapping("/car charger details")
    public String carchargerdetails() {
        return "car charger details";
    }

    private List<Inventory> itemList() {
        List<Inventory> item = new ArrayList<>();

        //items.add(new Inventory());
        return item;
    }

    @GetMapping("/bad")
    public String badRequest() {
        throw new RuntimeException("OOPS!");
    }

}
