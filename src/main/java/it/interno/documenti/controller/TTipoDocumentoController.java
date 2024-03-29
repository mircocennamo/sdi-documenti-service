package it.interno.documenti.controller;

import io.swagger.v3.oas.annotations.Operation;
import it.interno.documenti.dto.ResponseDto;
import it.interno.documenti.dto.TTipoDocumentoDto;
import it.interno.documenti.service.TTipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/tipo-documento")
public class TTipoDocumentoController {

    @Autowired
    private TTipoDocumentoService tTipoDocumentoService;

    @Operation(summary = "API per recuperare la lista di documenti di identita")
    @GetMapping
    public ResponseEntity<ResponseDto<List<TTipoDocumentoDto>>> getDocumentiIdentita(@RequestParam @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate dataRif){

        return ResponseEntity.ok(ResponseDto.<List<TTipoDocumentoDto>>builder()
                .code(HttpStatus.OK.value())
                .body(tTipoDocumentoService.getDocumentiIdentita(dataRif))
                .build()
        );
    }

    @Operation(summary = "API per recuperare la lista di documenti di identita")
    @GetMapping(path = "/{tipoDocumento}")
    public ResponseEntity<ResponseDto<TTipoDocumentoDto>> getTipoDocumentoById(@PathVariable String tipoDocumento) {

        return ResponseEntity.ok(ResponseDto.<TTipoDocumentoDto>builder()
                .code(HttpStatus.OK.value())
                .body(tTipoDocumentoService.getTipoDocumentoById(tipoDocumento))
                .build()
        );
    }

}
