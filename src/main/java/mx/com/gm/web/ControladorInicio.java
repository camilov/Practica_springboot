package mx.com.gm.web;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.dao.IClientesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author Janus
 */
@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private IClientesDao iClientesDao;
    
     @GetMapping("/")
     public String inicio(Model model){
         
         var clientes = iClientesDao.findAll();
         model.addAttribute("clientes",clientes);
         log.info("Ejecutando el controlador Spring 2");
         return "index";
     }
    
}
