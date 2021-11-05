package br.com.zup.simulacaoInvestimentos.simulador.config;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ControllerAdvisor {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)

    public List<MensagemDeErros> CapturarExcessoesValidacao(MethodArgumentNotValidException exception) {
        //usando stream no lugar do FOR
        List<MensagemDeErros> listaMensagens = exception.getFieldErrors().stream().map(erro -> new MensagemDeErros
                (erro.getDefaultMessage())).collect(Collectors.toList());
        /*List<MensagemDeErros> listaMensagens = new ArrayList<>();
        for (FieldError fieldError : exception.getFieldErrors()) {
            listaMensagens.add(new MensagemDeErros(fieldError.getDefaultMessage()));
        }*/
        return listaMensagens;
    }
}
