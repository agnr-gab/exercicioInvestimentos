package br.com.zup.simulacaoInvestimentos.simulador;

import br.com.zup.simulacaoInvestimentos.simulador.dtos.InvestimentoDTO;
import br.com.zup.simulacaoInvestimentos.simulador.dtos.SimuladorDTO;
import org.springframework.stereotype.Service;

@Service
public class InvestimentoService {

    public SimuladorDTO calcularIvestimento(InvestimentoDTO investimentoDTO) {
        var valorInvestido = investimentoDTO.getValorInvestido();
        var lucro = 0;
        var periodoDeAplicacaoMeses = investimentoDTO.getPeriodoDeAplicacaoMeses();

        return new SimuladorDTO();

    }

}
