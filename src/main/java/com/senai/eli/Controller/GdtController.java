package com.senai.eli.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.senai.eli.Model.Gdt;
import com.senai.eli.Repository.GdtRepository;

@Controller
public class GdtController  {

    @Autowired
    private GdtRepository er;

    @GetMapping("/Gdt/criar")
    public String criar(){
        return "Gdt/criar";
    }

    @PostMapping("/Gdt/criar")
    public String criar(Gdt ev){
        er.save(ev);
        return "redirect:/Gdt";

    }

    @GetMapping("/Gdt")
    public String listar(Model view){
        List<Gdt> listaGdts = er.findAll();

        view.addAttribute("listaGdtsNoFront", listaGdts);

        return "Gdt/listar";
    }

    

    @GetMapping("/Gdt/alterar/{id}")
    public String alterar(@PathVariable long id, Model model) {
    Gdt Gdt;
    Gdt = er.findById(id).orElseThrow();

    model.addAttribute("Gdt", Gdt);
    return "Gdt/alterar";
    }

    @PostMapping("/Gdt/alterar/{id}")
    public String Alterar(@PathVariable Long id, Gdt gdt) {
        gdt.setId(id);

        er.save(gdt);
        
        return "redirect:/Gdt";
    }
  }
