package com.taller1.taller1.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.taller1.taller1.Models.DAO.IClienteDao;
import com.taller1.taller1.Models.Entity.cliente;

@Controller
public class clienteController {

    @Autowired
    private IClienteDao clienteDao;

    @GetMapping("/listar")
    public String Listar (Model model){
        model.addAttribute("titulo", "Listado de clientes");
        model.addAttribute("cliente", clienteDao.findAll());
        return "listar";
    }
    @GetMapping("/form")
    public String crear(Model model){
        cliente cliente = new cliente();
        model.addAttribute("titulo","formulario de cliente");
        model.addAttribute("cliente",cliente);

        return "form";
    }
    @PostMapping("/form")
    public String Guardar(cliente cliente){
        clienteDao.Save(cliente);
        return"redirect:listar";
    }
}
