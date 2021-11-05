package br.com.zup.simulacaoInvestimentos.simulador;

import br.com.zup.simulacaoInvestimentos.simulador.dtos.InvestimentoDTO;
import br.com.zup.simulacaoInvestimentos.simulador.dtos.SimuladorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/simulacao")

public class InvestimentoController {

    @Autowired
    private InvestimentoService investimentoService;
    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SimuladorDTO calcularInvestimento(@RequestBody @Valid InvestimentoDTO investimentoDTO) {
        return investimentoService.calcularIvestimento(investimentoDTO);

    }

}
