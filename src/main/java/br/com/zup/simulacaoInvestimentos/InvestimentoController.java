package br.com.zup.simulacaoInvestimentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/simulacao")

public class InvestimentoController {
    @Autowired
    private Risco risco;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarInvestimento(@RequestBody @Valid InvestimentoDTO investimentoDTO) {

    }

}
