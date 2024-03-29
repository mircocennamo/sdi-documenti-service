package it.interno.documenti.repository;

import it.interno.documenti.entity.TTipoDocumento;
import it.interno.documenti.entity.key.TTipoDocumentoKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface TTipoDocumentoRepository extends JpaRepository<TTipoDocumento, TTipoDocumentoKey> {

    @Query("FROM TTipoDocumento t " +
            "WHERE t.tsCancellazione IS NULL " +
            "AND t.dataInizioValidita <= ?1 " +
            "AND (t.dataFineValidita IS NULL OR t.dataFineValidita >= ?1) " +
            "AND t.flagIdentita = 'S' " +
            "AND t.idMacroCategoria IN ('001', '003', '005') " +
            "ORDER BY t.descrizioneTipoDocumento ASC")
    List<TTipoDocumento> getDocumentiIdentita(LocalDate dataRif);

    TTipoDocumento findByTipoDocumentoAndTsCancellazioneIsNull(String tipoDocumento) ;

}
