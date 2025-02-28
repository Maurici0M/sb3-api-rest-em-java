package med.voll.api.controller;

import med.voll.api.paciente.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/paciente")
public class PacienteController {
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroPaciente dados){
        /*if (dados.endereco().numero() == null || dados.endereco().complemento() == null ) {
            System.out.println(dados);
        }
        else {
            System.out.println(dados);
        }*/
        System.out.println(dados);

    }
}
