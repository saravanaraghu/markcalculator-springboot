package com.dev.calculator.calciapp.StudentController;

import com.dev.calculator.calciapp.Domain.Student;
import org.h2.engine.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {


    @GetMapping("/marks")
    public String Marks(Model model){
        model.addAttribute("student", new Student());
        return "marks";
    }

    @PostMapping("/result")
    public String processForm(@ModelAttribute Student student, BindingResult result, Model model){
        model.addAttribute("student",student);
        return "result";
    }
}
