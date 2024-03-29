package it.interno.documenti.service;

import it.interno.documenti.dto.TTipoDocumentoDto;
import it.interno.documenti.mapper.TTipoDocumentoMapper;
import it.interno.documenti.repository.TTipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TTipoDocumentoServiceImpl implements TTipoDocumentoService {

    @Autowired
    private TTipoDocumentoRepository tTipoDocumentoRepository;
    @Autowired
    private TTipoDocumentoMapper tTipoDocumentoMapper;

    @Override
    public List<TTipoDocumentoDto> getDocumentiIdentita(LocalDate dataRif) {
        return tTipoDocumentoRepository.getDocumentiIdentita(dataRif)
                .stream()
                .map(el -> tTipoDocumentoMapper.toDto(el))
                .collect(Collectors.toList());
    }

    @Override
    public TTipoDocumentoDto getTipoDocumentoById(String tipoDocumento) {
        return tTipoDocumentoMapper.toDto(tTipoDocumentoRepository.findByTipoDocumentoAndTsCancellazioneIsNull(tipoDocumento));
    }

}
