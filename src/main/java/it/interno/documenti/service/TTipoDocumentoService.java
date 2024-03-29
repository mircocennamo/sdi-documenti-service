package it.interno.documenti.service;

import it.interno.documenti.dto.TTipoDocumentoDto;

import java.time.LocalDate;
import java.util.List;

public interface TTipoDocumentoService {

    List<TTipoDocumentoDto> getDocumentiIdentita(LocalDate dataRif);

    TTipoDocumentoDto getTipoDocumentoById(String tipoDocumento);

}
